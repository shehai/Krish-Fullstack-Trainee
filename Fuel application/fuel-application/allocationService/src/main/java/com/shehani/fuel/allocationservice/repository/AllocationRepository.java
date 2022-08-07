package com.shehani.fuel.allocationservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shehani.fuel.allocationservice.model.Allocation;


@Repository
public interface AllocationRepository extends MongoRepository<Allocation,String>{

}
