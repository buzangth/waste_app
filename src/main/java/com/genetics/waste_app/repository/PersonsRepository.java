package com.genetics.waste_app.repository;


import com.genetics.waste_app.model.person.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
;
import java.util.List;
@Repository
public interface PersonsRepository extends PagingAndSortingRepository<Person, String> {

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    Page<Person> search(String keyword, Pageable pageable);

    @Query("{\"name\": {$regex : ?0, $options: 'i'}}")
    List<Person> search(String keyword);

    @Query(value = "{'person.id': ?0}", fields = "{'person' : 0}")
    List findPersonById(String id);

}