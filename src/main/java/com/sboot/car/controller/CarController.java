package com.sboot.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.car.domain.Car;
import com.sboot.car.repository.CarRepository;

@RestController
public class CarController {
	@Autowired
	private CarRepository repository;

	// @RequestMapping("/cars")
	@GetMapping("/cars")
	public Iterable<Car> getCars() {
		return repository.findAll();
	}
}