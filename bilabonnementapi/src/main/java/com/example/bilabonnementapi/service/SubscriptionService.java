package com.example.bilabonnementapi.service;

import com.example.bilabonnementapi.entity.DamageReport;
import com.example.bilabonnementapi.entity.Subscription;
import com.example.bilabonnementapi.repository.IDamageReportRepository;
import com.example.bilabonnementapi.repository.ISubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {
    private ISubscriptionRepository subRepo;
    public SubscriptionService(ISubscriptionRepository subRepo) {
        this.subRepo = subRepo;
    }
    public Subscription createSubscription(Subscription subscription) {
        // Validation and business logic before saving
        return subRepo.save(subscription);
    }
    public List<Subscription> getAllSubscriptions() {
        return subRepo.findAll();
    }
    public Subscription getSubscriptionById(String id) {
        return subRepo.findById(id)
                .orElseThrow(() -> new SubscriptionService.ResourceNotFoundException("Subscriptions not found"));
    }
    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
    public void deleteSubscription(String id) {
        Subscription subscription = subRepo.findById(id)
                .orElseThrow(() -> new SubscriptionService.ResourceNotFoundException("Subscription not found"));
        subRepo.delete(subscription);
    }
    public Subscription updateSubscription(String id, Subscription subscriptionDetails) {
        Subscription subscription = subRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Subscription not found"));

        // Update properties of 'subscription' with 'subscriptionDetails'
        subscription.setCar(subscriptionDetails.getCar());
        subscription.setCustomer(subscriptionDetails.getCustomer()); // If applicable
        subscription.setBuydate(subscriptionDetails.getBuydate());
        subscription.setSubstart(subscriptionDetails.getSubstart());
        subscription.setSubend(subscriptionDetails.getSubend());
        subscription.setKmstart(subscriptionDetails.getKmstart());
        subscription.setKmdone(subscriptionDetails.getKmdone());
        subscription.setKmplanned(subscriptionDetails.getKmplanned());
        subscription.setSubtime(subscriptionDetails.getSubtime());
        // Assuming you handle the damageReport separately or it's updated elsewhere
        // subscription.setDamageReport(subscriptionDetails.getDamageReport());

        return subRepo.save(subscription);
    }
}
