package com.example.bilabonnementapi.config;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.entity.Customer;
import com.example.bilabonnementapi.entity.DamageReport;
import com.example.bilabonnementapi.entity.Subscription;
import com.example.bilabonnementapi.repository.ICarRepository;
import com.example.bilabonnementapi.repository.ICustomerRepository;
import com.example.bilabonnementapi.repository.IDamageReportRepository;
import com.example.bilabonnementapi.repository.ISubscriptionRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;

@Configuration
public class DeveloperData implements ApplicationRunner{

    ICarRepository carRepo;
    ISubscriptionRepository subRepo;
    ICustomerRepository customerRepo;
    IDamageReportRepository dmgRepo;

    public DeveloperData(ICarRepository carRepo, ISubscriptionRepository subRepo, ICustomerRepository customerRepo, IDamageReportRepository dmgRepo) {
        this.carRepo = carRepo;
        this.subRepo = subRepo;
        this.customerRepo = customerRepo;
        this.dmgRepo = dmgRepo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Car car1 = new Car("test", "test2", 5000, "benz", "reg51z", "ff238f1",true);
        carRepo.save(car1);
        Subscription sub1 = new Subscription("2023-11-11", "2023-11-11", "2023-11-11", 10000, 12000, 15000,12, car1);
        subRepo.save(sub1);
        ArrayList list = new ArrayList();
        list.add(sub1);
        Car car2 = new Car("test2", "test5",5000, "benzin",false,list);
        carRepo.save(car2);

        Customer customer = new Customer("Jeppe", "Jeppesen", "roskildevej 38", 2500, "Valby", 22690454, "test@test.dk", 2525252525l);
        customerRepo.save(customer);
        Subscription sub2 = new Subscription("2023-11-11", "2023-11-11", "2023-11-11", 5000, 8000, 10000, 24, car2, customer);
        subRepo.save(sub2);

        DamageReport dmgrep1 = new DamageReport("flækket sidespejl, ødelagt forrude", 800, 2000, sub2);
        dmgRepo.save(dmgrep1);
        ArrayList carlist = new ArrayList();
        carlist.add(car1);
        carlist.add(car2);





    }
}
