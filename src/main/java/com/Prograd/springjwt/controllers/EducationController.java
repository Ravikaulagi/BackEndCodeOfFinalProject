package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Education;
import com.Prograd.springjwt.security.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/test/education")

public class EducationController {
    @Autowired
    private EducationService educationService;

    @GetMapping("/alledcationinfo")
    public List<Education> getAllEducationInfo()
    {
        return educationService.getAllEducationInfo();
    }
    @GetMapping("{id}")
    public ResponseEntity<Education> getEducationInfoById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Education>(educationService.getEducationInfoById(id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEducationInfo(@PathVariable("id")int id)
    {
        educationService.deleteEducationInfo(id);
        return new ResponseEntity<String>("Education Information deleted successfully",HttpStatus.OK);
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Education> saveBooking(@RequestBody Education education)
    {
        System.out.println(education);
        return new ResponseEntity<Education>(educationService.saveEducation(education), HttpStatus.CREATED);
    }
}
