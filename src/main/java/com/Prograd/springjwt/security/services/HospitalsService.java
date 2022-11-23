package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Education;
import com.Prograd.springjwt.models.Hospitals;

import java.util.List;

public interface HospitalsService {

    void  deleteHospitalsInfo(int id);

    Hospitals  getHospitalsInfoById(int id);

    List<Hospitals> getAllHospitalsInfo();
    Hospitals saveHospitals(Hospitals hospitals);
}
