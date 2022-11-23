package com.Prograd.springjwt.repository;

import com.Prograd.springjwt.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepo extends JpaRepository<Education,Integer> {
}
