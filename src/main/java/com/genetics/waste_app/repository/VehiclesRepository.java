package com.genetics.waste_app.repository;

import com.genetics.waste_app.model.vahicle.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;


public interface VehiclesRepository extends PagingAndSortingRepository<Vehicle, String> {

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    Page<Vehicle> search(String keyword, Pageable pageable);

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    List<Vehicle> search(String keyword);
}