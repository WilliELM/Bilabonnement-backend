package com.example.bilabonnementapi.service;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.entity.Customer;
import com.example.bilabonnementapi.repository.ICarRepository;
import com.example.bilabonnementapi.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private ICustomerRepository customerRepo;
    public CustomerService(ICustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }
    public Customer createCustomer(Customer customer) {
        // Validation and business logic before saving
        return customerRepo.save(customer);
    }
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
    public Customer getCustomerById(String id) {
        return customerRepo.findById(id)
                .orElseThrow(() -> new CustomerService.ResourceNotFoundException("Customer not found"));
    }
    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
    public void deleteCustomer(String id) {
        Customer customer = customerRepo.findById(id)
                .orElseThrow(() -> new CustomerService.ResourceNotFoundException("Customer not found"));
        customerRepo.delete(customer);
    }
    public Customer updateCustomer(String id, Customer customerDetails) {
        Customer customer = customerRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));

        // Update properties of 'customer' with 'customerDetails'
        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        customer.setAddress(customerDetails.getAddress());
        customer.setZipcode(customerDetails.getZipcode());
        customer.setCity(customerDetails.getCity());
        customer.setPhone(customerDetails.getPhone());
        customer.setEmail(customerDetails.getEmail());
        customer.setCpr(customerDetails.getCpr());
        // Assuming you handle the subscription separately
        // customer.setSubscription(customerDetails.getSubscription());

        return customerRepo.save(customer);
    }
}
