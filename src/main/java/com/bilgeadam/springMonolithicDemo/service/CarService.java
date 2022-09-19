package com.bilgeadam.springMonolithicDemo.service;


import com.bilgeadam.springMonolithicDemo.repository.CarRepository;
import com.bilgeadam.springMonolithicDemo.repository.entity.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private  final CarRepository carRepository;



    public void  save(Car car){

            carRepository.save(car);

    }


    public List<Car> findAll() {

        return  carRepository.findAll();
    }
}
