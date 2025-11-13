package com.sboot.car;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sboot.car.domain.Car;
import com.sboot.car.domain.Owner;
import com.sboot.car.domain.User;
import com.sboot.car.repository.CarRepository;
import com.sboot.car.repository.OwnerRepository;
import com.sboot.car.repository.UserRepository;

@SpringBootApplication
public class CarApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CarApplication.class);

	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;

	@Autowired
	private UserRepository urepository;

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
		logger.info("HelloApplication Start");
	}

	public void run(String... args) throws Exception {

		boolean isCreate = false;
		if (isCreate) {
			Owner owner1 = new Owner("한길", "주");
			Owner owner2 = new Owner("두길", "김");
			Owner owner3 = new Owner("세길", "박");
			orepository.saveAll(Arrays.asList(owner1, owner2, owner3));

			Car car1 = new Car("기아", "쏘렌토", "White", "KIA-2501", 2025, 61000, owner1);
			Car car2 = new Car("기아", "스포티지", "Black", "KIA-2502", 2025, 48000, owner1);
			Car car3 = new Car("기아", "K5", "Silver", "KIA-2503", 2025, 35000, owner2);
			Car car4 = new Car("기아", "K8", "White", "KIA-2506", 2025, 56000, owner2);
			Car car5 = new Car("기아", "EV6", "Blue", "KIA-2504", 2025, 72000, owner2);
			Car car6 = new Car("기아", "카니발", "Gray", "KIA-2505", 2025, 65000, owner3);
			Car car7 = new Car("기아", "모닝", "Red", "KIA-2507", 2025, 21000, owner3);

			repository.saveAll(Arrays.asList(car1, car2, car3, car4, car5, car6, car7));

			for (Car car : repository.findAll()) {
				logger.info(car.getBrand() + " " + car.getModel());
			}

			urepository.save(new User("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"));
			urepository
					.save(new User("admin", "$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));

		}
	}
}
