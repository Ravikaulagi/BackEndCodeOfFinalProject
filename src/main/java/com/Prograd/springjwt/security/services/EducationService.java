package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Advertise;
import com.Prograd.springjwt.models.Education;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface EducationService {

    void  deleteEducationInfo(int id);
    Education getEducationInfoById(int id);
    List<Education> getAllEducationInfo();
    Education saveEducation(Education education);
}
