package com.nishant.springdatarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nishant.springdatarest.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Integer>{

} 
