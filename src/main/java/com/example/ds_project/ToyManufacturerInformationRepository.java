package com.example.ds_project;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ToyManufacturerInformationRepository extends CrudRepository<ToyManufacturerDetails, Integer> {

}