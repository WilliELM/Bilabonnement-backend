package com.example.bilabonnementapi.api;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.entity.Customer;
import com.example.bilabonnementapi.entity.DamageReport;
import com.example.bilabonnementapi.entity.Subscription;
import com.example.bilabonnementapi.repository.ICarRepository;
import com.example.bilabonnementapi.repository.ICustomerRepository;
import com.example.bilabonnementapi.repository.IDamageReportRepository;
import com.example.bilabonnementapi.repository.ISubscriptionRepository;
import com.example.bilabonnementapi.service.CarService;
import com.example.bilabonnementapi.service.CustomerService;
import com.example.bilabonnementapi.service.DamageReportService;
import com.example.bilabonnementapi.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private CarService carService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private DamageReportService damageReportService;
    @Autowired
    private SubscriptionService subscriptionService;

    //Carcontrollers
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.ok().body(cars);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cars/{id}")
    public Car getCarById(@PathVariable String id) {
        return carService.getCarById(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/cars")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car newCar = carService.createCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable String id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    //Customer controllers
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok().body(customers);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok().body(customer);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        return ResponseEntity.ok().body(updatedCustomer);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
    // Damage Report Controllers
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/damagereports")
    public ResponseEntity<List<DamageReport>> getAllDamageReports() {
        List<DamageReport> damageReports = damageReportService.getAllDamageReports();
        return ResponseEntity.ok().body(damageReports);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/damagereports/{id}")
    public ResponseEntity<DamageReport> getDamageReportById(@PathVariable String id) {
        DamageReport damageReport = damageReportService.getDamageReportById(id);
        return ResponseEntity.ok().body(damageReport);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/damagereports")
    public ResponseEntity<DamageReport> createDamageReport(@RequestBody DamageReport damageReport) {
        DamageReport newDamageReport = damageReportService.createDamageReport(damageReport);
        return new ResponseEntity<>(newDamageReport, HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/damagereports/{id}")
    public ResponseEntity<DamageReport> updateDamageReport(@PathVariable String id, @RequestBody DamageReport damageReport) {
        DamageReport updatedDamageReport = damageReportService.updateDamageReport(id, damageReport);
        return ResponseEntity.ok().body(updatedDamageReport);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/damagereports/{id}")
    public ResponseEntity<Void> deleteDamageReport(@PathVariable String id) {
        damageReportService.deleteDamageReport(id);
        return ResponseEntity.noContent().build();
    }


    // Subscription Controllers
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/subscriptions")
    public ResponseEntity<List<Subscription>> getAllSubscriptions() {
        List<Subscription> subscriptions = subscriptionService.getAllSubscriptions();
        return ResponseEntity.ok().body(subscriptions);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/subscriptions/{id}")
    public ResponseEntity<Subscription> getSubscriptionById(@PathVariable String id) {
        Subscription subscription = subscriptionService.getSubscriptionById(id);
        return ResponseEntity.ok().body(subscription);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
        Subscription newSubscription = subscriptionService.createSubscription(subscription);
        return new ResponseEntity<>(newSubscription, HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/subscriptions/{id}")
    public ResponseEntity<Subscription> updateSubscription(@PathVariable String id, @RequestBody Subscription subscription) {
        Subscription updatedSubscription = subscriptionService.updateSubscription(id, subscription);
        return ResponseEntity.ok().body(updatedSubscription);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/subscriptions/{id}")
    public ResponseEntity<Void> deleteSubscription(@PathVariable String id) {
        subscriptionService.deleteSubscription(id);
        return ResponseEntity.noContent().build();
    }
}
