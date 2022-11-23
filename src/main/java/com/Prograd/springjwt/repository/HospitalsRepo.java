package com.Prograd.springjwt.repository;

import com.Prograd.springjwt.models.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface HospitalsRepo extends JpaRepository<Hospitals, Integer> {
}
