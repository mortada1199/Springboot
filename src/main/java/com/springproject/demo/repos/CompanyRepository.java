package com.springproject.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.demo.models.Company;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CompanyRepository extends JpaRepository<Company,Long> {
    
}