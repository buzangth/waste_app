package com.genetics.waste_app.repository;

import com.genetics.waste_app.model.Bin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;


public interface BinsRepository  extends PagingAndSortingRepository<Bin, String> {

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    Page<Bin> search(String keyword, Pageable pageable);

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    List<Bin> search(String keyword);
}
