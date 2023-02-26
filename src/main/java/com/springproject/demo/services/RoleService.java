package com.springproject.demo.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.demo.repos.RoleRepository;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    
}
