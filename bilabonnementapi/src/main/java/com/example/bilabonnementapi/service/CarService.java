package com.example.bilabonnementapi.service;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.repository.ICarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private ICarRepository carRepo;
    public CarService(ICarRepository carRepo) {
        this.carRepo = carRepo;
    }
    public Car createCar(Car car) {
        // Validation and business logic before saving
        return carRepo.save(car);
    }
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }
    public Car getCarById(String id) {
        return carRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found"));
    }
    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
    public void deleteCar(String id) {
        Car car = carRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found"));
        carRepo.delete(car);
    }
    public Car updateCar(String id, Car carDetails) {
        Car car = carRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found"));

        // Update properties of 'car' with 'carDetails'
        car.setBrand(carDetails.getBrand());
        car.setModel(carDetails.getModel());
        car.setPrice(carDetails.getPrice());
        car.setFueltype(carDetails.getFueltype());
        car.setRegNr(carDetails.getRegNr());
        car.setNummerplade(carDetails.getNummerplade());
        car.setCarFree(carDetails.getCarFree());

        return carRepo.save(car);
    }

    // Usage in your service

}
