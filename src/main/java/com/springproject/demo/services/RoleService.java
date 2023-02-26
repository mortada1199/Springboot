package com.nctr.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nctr.training.models.Role;
import com.nctr.training.repos.RoleRepository;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    
}
