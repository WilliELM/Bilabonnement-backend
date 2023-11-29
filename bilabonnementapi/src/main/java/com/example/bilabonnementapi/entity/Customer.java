package com.example.bilabonnementapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String address;
    private int zipcode;
    private String city;
    private int phone;
    private String email;
    private Long cpr;

    @OneToOne(mappedBy = "customer")
    @JsonIgnore
    private Subscription subscription;

    public Customer(String firstName, String lastName, String address, int zipcode, String city, int phone, String email, Long cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.cpr = cpr;
    }

    public Customer(String firstName, String lastName, String address, int zipcode, String city, int phone, String email, Long cpr, Subscription subscription) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.cpr = cpr;
        this.subscription = subscription;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpr() {
        return cpr;
    }

    public void setCpr(Long cpr) {
        this.cpr = cpr;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", zipcode=" + zipcode +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", cpr=" + cpr +
                ", subscription=" + subscription +
                '}';
    }
}
