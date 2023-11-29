package com.example.bilabonnementapi.repository;

import com.example.bilabonnementapi.entity.Customer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, String> {
}
