package com.bilgeadam.springMonolithicDemo.controller;

import com.bilgeadam.springMonolithicDemo.repository.entity.Car;
import com.bilgeadam.springMonolithicDemo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {


    private  final CarService carService;

    @GetMapping("/save")
    public ResponseEntity<Void> save(String brand,String carModel,String modelYear){

//        Car car2=new Car();
//        car2.setCarModel(carModel);
//        car2.setBrand(brand);
//        car2.setCarModel(modelYear);

        carService.save(Car.builder().brand(brand).carModel(carModel).modelYear(modelYear).build());

        return  ResponseEntity.ok().build();

    }

    @GetMapping("/findall")
    public ResponseEntity<List<Car>> findAll(){
        return  ResponseEntity.ok(carService.findAll());
    }

}
