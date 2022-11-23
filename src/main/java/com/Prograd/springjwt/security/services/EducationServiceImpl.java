package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Education;
import com.Prograd.springjwt.repository.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService{


    @Autowired
    private EducationRepo educationRepo;

    public EducationServiceImpl(EducationRepo educationRepo)
    {
        this.educationRepo=educationRepo;
    }



    @Override
    public void deleteEducationInfo(int id) {
        educationRepo.findById(id);
       educationRepo.deleteById(id);
    }

    @Override
    public Education getEducationInfoById(int id) {
        return null;
    }

    @Override
    public List<Education> getAllEducationInfo() {
        return educationRepo.findAll();
    }

    @Override
    public Education saveEducation(Education education) {
        return educationRepo.save(education);
    }
}
