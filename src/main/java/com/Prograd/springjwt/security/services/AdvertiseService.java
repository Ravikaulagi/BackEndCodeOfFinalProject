package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Advertise;

import java.util.List;

public interface AdvertiseService {
    Advertise saveAdvertise(Advertise advertise);
    List<Advertise> getAllAdvertise();
    Advertise getAdvertiseById(int id);
    void deleteAdvertise(int id);
}

