package com.genetics.waste_app.controller;

import com.genetics.waste_app.model.Depo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/depo")
public class DepoController {

    List<Depo> addDepo = new ArrayList<>();

    @PostMapping(path = "/createDepo")
    public ResponseEntity<?> newUser(@Valid @RequestBody Depo depo){
        Depo depo1 = new Depo();
        depo1.setId(depo.getId());
        depo1.setName(depo.getName());
        depo1.setLocation(depo.getLocation());

        addDepo.add(depo1);

        return new ResponseEntity<Depo>(depo1, HttpStatus.OK);
    }

    @GetMapping(value="/getDepoById/{id}")
    public Depo getById(@PathVariable("id") String id){

        return addDepo.stream().filter(depo -> id.equals(depo.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Depo " + id + "doesn't exist"));

    }

    @GetMapping(value = "/all")
    public  Iterable<Depo> allDepo() throws Exception {
        return addDepo;
    }
    @DeleteMapping(value="/deleteById/{id}")
    public void deleteById(@PathVariable("id") String id) throws Exception{

        addDepo.removeIf(depo -> id.equals(depo.getId()));
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
//        return addPerson.;
//    }



}
