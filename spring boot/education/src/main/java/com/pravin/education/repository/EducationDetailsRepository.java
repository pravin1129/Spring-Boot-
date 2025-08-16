package com.pravin.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravin.education.entity.EducationDetails;

@Repository
public interface EducationDetailsRepository  extends JpaRepository<EducationDetails, Long>{

}
