package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Education;
import com.Prograd.springjwt.models.Hospitals;
import com.Prograd.springjwt.repository.EducationRepo;
import com.Prograd.springjwt.repository.HospitalsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalsServiceImpl implements HospitalsService {

    @Autowired
    private HospitalsRepo hospitalsRepo;

    public HospitalsServiceImpl(HospitalsRepo hospitalsRepo)
    {
        this.hospitalsRepo=hospitalsRepo;
    }


    @Override
    public void deleteHospitalsInfo(int id) {
        hospitalsRepo.findById(id);
        hospitalsRepo.deleteById(id);
    }

    @Override
    public Hospitals getHospitalsInfoById(int id) {
        return null;
    }

    @Override
    public List<Hospitals> getAllHospitalsInfo() {
        return hospitalsRepo.findAll();
    }

    @Override
    public Hospitals saveHospitals(Hospitals hospitals) {
        return hospitalsRepo.save(hospitals);
    }
}