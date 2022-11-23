package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Advertise;
import com.Prograd.springjwt.repository.AdvertiseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertiseServiceImpl implements AdvertiseService{

    @Autowired
    private AdvertiseRepo advertiseRepo;

    public AdvertiseServiceImpl(AdvertiseRepo advertiseRepo) {
        this.advertiseRepo = advertiseRepo;
    }

    @Override
    public Advertise saveAdvertise(Advertise advertise) {
        return advertiseRepo.save(advertise);
    }

    @Override
    public List<Advertise> getAllAdvertise() {
        return advertiseRepo.findAll();
    }

    @Override
    public Advertise getAdvertiseById(int id) {
        return null;
    }

    @Override
    public void deleteAdvertise(int id) {
        advertiseRepo.findById(id);
        advertiseRepo.deleteById(id);
    }
}
