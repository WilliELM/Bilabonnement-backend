package com.example.bilabonnementapi.entity;

import jakarta.persistence.*;

@Entity
public class DamageReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String damageDescription;
    private int repairCost;
    private int cleaningCost;
    @OneToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    public DamageReport(String damageDescription, int repairCost, int cleaningCost) {
        this.damageDescription = damageDescription;
        this.repairCost = repairCost;
        this.cleaningCost = cleaningCost;
    }

    public DamageReport(String damageDescription, int repairCost, int cleaningCost, Subscription subscription) {
        this.damageDescription = damageDescription;
        this.repairCost = repairCost;
        this.cleaningCost = cleaningCost;
        this.subscription = subscription;
    }

    public DamageReport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public int getCleaningCost() {
        return cleaningCost;
    }

    public void setCleaningCost(int cleaningCost) {
        this.cleaningCost = cleaningCost;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "DamageReport{" +
                "id=" + id +
                ", damageDescription='" + damageDescription + '\'' +
                ", repairCost=" + repairCost +
                ", cleaningCost=" + cleaningCost +
                ", subscription=" + subscription +
                '}';
    }
}
