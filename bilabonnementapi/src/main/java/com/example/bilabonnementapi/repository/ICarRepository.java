package com.example.bilabonnementapi.repository;

import com.example.bilabonnementapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, String> {
}
