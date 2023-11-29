package com.example.bilabonnementapi.service;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.entity.DamageReport;
import com.example.bilabonnementapi.repository.ICarRepository;
import com.example.bilabonnementapi.repository.IDamageReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageReportService {
    private IDamageReportRepository dmgRepo;
    public DamageReportService(IDamageReportRepository dmgRepo) {
        this.dmgRepo = dmgRepo;
    }
    public DamageReport createDamageReport(DamageReport damageReport) {
        // Validation and business logic before saving
        return dmgRepo.save(damageReport);
    }
    public List<DamageReport> getAllDamageReports() {
        return dmgRepo.findAll();
    }
    public DamageReport getDamageReportById(String id) {
        return dmgRepo.findById(id)
                .orElseThrow(() -> new DamageReportService.ResourceNotFoundException("Damage report not found"));
    }
    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
    public void deleteDamageReport(String id) {
        DamageReport damageReport = dmgRepo.findById(id)
                .orElseThrow(() -> new DamageReportService.ResourceNotFoundException("Damage report not found"));
        dmgRepo.delete(damageReport);
    }
    public DamageReport updateDamageReport(String id, DamageReport damageReportDetails) {
        DamageReport damageReport = dmgRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Damage report not found"));

        // Update properties of 'damageReport' with 'damageReportDetails'
        damageReport.setDamageDescription(damageReportDetails.getDamageDescription());
        damageReport.setRepairCost(damageReportDetails.getRepairCost());
        damageReport.setCleaningCost(damageReportDetails.getCleaningCost());
        // Assuming you handle the subscription separately or it's updated elsewhere
        // damageReport.setSubscription(damageReportDetails.getSubscription());

        return dmgRepo.save(damageReport);
    }
}
