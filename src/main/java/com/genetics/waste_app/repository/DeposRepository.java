package com.genetics.waste_app.repository;

import com.genetics.waste_app.model.Depo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;


public interface DeposRepository extends PagingAndSortingRepository<Depo, String> {

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    Page<Depo> search(String keyword, Pageable pageable);

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    List<Depo> search(String keyword);
}

