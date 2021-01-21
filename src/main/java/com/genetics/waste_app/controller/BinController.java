package com.genetics.waste_app.controller;

import com.genetics.waste_app.model.Bin;

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
@RequestMapping("/api/v1/bin")
public class BinController {
    List<Bin> addBin = new ArrayList<>();


    @PostMapping(path = "/createBin")
    public ResponseEntity<?> newBin(@Valid @RequestBody Bin bin){
        Bin bin1 = new Bin();
        bin1.setId(bin.getId());
        bin1.setLocation(bin.getLocation());;
        addBin.add(bin1);

        return new ResponseEntity<Bin>(bin1, HttpStatus.OK);
    }

    @GetMapping(value="/getBinById/{id}")
    public Bin getById(@PathVariable("id") String id){

        return addBin.stream().filter(bin -> id.equals(bin.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("bin " + id + "doesn't exist"));

    }

    @DeleteMapping(value="/deleteBinById/{id}")
    public void deleteById(@PathVariable("id") String id) throws Exception{

        addBin.removeIf(bin -> id.equals(bin.getId()));
    }

    @GetMapping(value = "/getAllBin")
    public  Iterable<Bin> allPerson() throws Exception {
        return addBin;
    }


//    @GetMapping(value = "/{page}/{perPage}/{sortOrder}/{sortField}")
//    public Page<Bin> search(@RequestParam(required = false, value = "keyword") String keyword,
//                            @PathVariable("page") int page,
//                            @PathVariable("perPage") int perPage,
//                            @PathVariable("sortOrder") Sort.Direction sort,
//                            @PathVariable("sortField") String sortField) throws Exception {
//        page = page - 1;
//        PageRequest pageRequest = new PageRequest(page,perPage,sort,sortField);
//
//        return ;
//    }



}
