package com.example.bilabonnementapi.repository;

import com.example.bilabonnementapi.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface ISubscriptionRepository extends JpaRepository<Subscription, String> {
}
