package com.bilgeadam.springMonolithicDemo.repository;

import com.bilgeadam.springMonolithicDemo.repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {




}
