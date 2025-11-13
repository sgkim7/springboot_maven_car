package com.sboot.car.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sboot.car.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	Optional<Owner> findByFirstname(String firstName);
}