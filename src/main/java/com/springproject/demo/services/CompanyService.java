package com.nctr.training.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nctr.training.models.Company;
import com.nctr.training.repos.CompanyRepository;
import com.nctr.training.requests.CreateCompanyRequest;
import com.nctr.training.requests.updateCompanyRequest;

import jakarta.websocket.server.PathParam;

@Service

public class CompanyService {
    @Autowired

    private CompanyRepository companyRepository;
    

    public Company create(CreateCompanyRequest companyRequest){
        Company company = new Company(0,companyRequest.getName());// remember sorted in collection is important  remember that
        Company result = companyRepository.save(company);
        return result;
    }

    public Company update(Company company,long companyId)   
    {  
        Optional<Company> company2 =companyRepository.findById(companyId);
        Company result =  companyRepository.save(company);  
        return result;
    }  
    
    public void delete(long id)   
    {  
        companyRepository.deleteById(id);  
    }  

}
