package com.genetics.waste_app.controller;

import com.genetics.waste_app.model.person.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

//    @Autowired
//    private Person person;

  //  private static final List<Person> PERSONS = Arrays.asList( new Person());

    List<Person> addPerson = new ArrayList<>();

    @PostMapping(path = "/createUser")
    public ResponseEntity<?> newUser(@Valid @RequestBody  Person person){
        Person person1 = new Person();
        person1.setId(person.getId());
        person1.setFirstName(person.getFirstName());
        person1.setLastName(person.getLastName());
        person1.setRole(person.getRole());
        addPerson.add(person1);

        return new ResponseEntity<Person>(person1,HttpStatus.OK);
    }

    @GetMapping(value="/getPersonById/{id}")
    public Person getById(@PathVariable("id") String id){

        return addPerson.stream().filter(person -> id.equals(person.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("person " + id + "doesn't exist"));

    }

    @GetMapping(value = "/all")
    public  Iterable<Person> allPerson() throws Exception {
        return addPerson;
    }
    @DeleteMapping(value="/deleteById/{id}")
    public void deleteById(@PathVariable("id") String id) throws Exception{

        addPerson.removeIf(person -> id.equals(person.getId()));
    }

//    @GetMapping(value = "/{page}/{perPage}/{sortOrder}/{sortField}")
//    public Page<Person> search(@RequestParam(required = false, value = "keyword") String keyword,
//                               @PathVariable("page") int page,
//                               @PathVariable("perPage") int perPage,
//                               @PathVariable("sortOrder") Sort.Direction sort,
//                               @PathVariable("sortField") String sortField) throws Exception {
//        page = page - 1;
//        PageRequest pageRequest = new PageRequest(page, perPage, sort, sortField);
//        if (keyword == null) {
//            keyword = "";
//        }
//
//        return null;
//    }





}
