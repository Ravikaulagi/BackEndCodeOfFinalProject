package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Education;
import com.Prograd.springjwt.models.Hospitals;
import com.Prograd.springjwt.security.services.EducationService;
import com.Prograd.springjwt.security.services.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/test/hospitals")
public class HospitalsController {
    @Autowired
    private HospitalsService hospitalsService;

    @GetMapping("/allhospitalsinfo")
    public List<Hospitals> getAllHospitalsInfo()
    {
        return hospitalsService.getAllHospitalsInfo();
    }

    @GetMapping("{id}")
    public ResponseEntity<Hospitals> getHospitalsInfoById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Hospitals>(hospitalsService.getHospitalsInfoById(id), HttpStatus.OK);
    }
}
