package com.example.bilabonnementapi.repository;

import com.example.bilabonnementapi.entity.DamageReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDamageReportRepository extends JpaRepository<DamageReport, String> {
}
