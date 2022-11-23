package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Advertise;
import com.Prograd.springjwt.security.services.AdvertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/test/advertise")
public class AdvertiseController {
    @Autowired
    private AdvertiseService advertiseService;

    public AdvertiseController(AdvertiseService advertiseService) {
        this.advertiseService = advertiseService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Advertise> saveAdvertise(@RequestBody Advertise advertise)
    {
        System.out.println(advertise);
        return new ResponseEntity<Advertise>(advertiseService.saveAdvertise(advertise), HttpStatus.CREATED);
    }
    @GetMapping("/alladvertise")
    public List<Advertise> getAllAdvertise()
    {
        return advertiseService.getAllAdvertise();
    }
    @GetMapping("{id}")
    public ResponseEntity<Advertise> getAdvertiseById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Advertise>(advertiseService.getAdvertiseById(id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAdvertise(@PathVariable("id")int id)
    {
        advertiseService.deleteAdvertise(id);
        return new ResponseEntity<String>("Advertise deleted successfully",HttpStatus.OK);
    }
}
