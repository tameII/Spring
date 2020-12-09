package com.trucmuche.art.web.controller;

import com.trucmuche.art.model.Painting;
import com.trucmuche.art.repository.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArtController {

    @Autowired
    private ArtRepository dao;

    @Value("${me}")
    private String me;

//    private String me = "not configured yet";


    @GetMapping(value = "/cestqui")
    public String getName() {
        System.out.println("On me demande : "+me);
        return me;
    }

    @GetMapping(value = "/art")
    public Iterable<Painting> getAll() {
        return dao.findAll();
    }

    @GetMapping(value = "/art/{id}")
    public Painting getPainting(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/art/get")
    public Painting artGet(@RequestParam int id) {
        return dao.findById(id);
    }

    @PostMapping(value = "/art/add")
    public void addPainting(@RequestBody Painting painting) {
        dao.save(painting);
    }


}
