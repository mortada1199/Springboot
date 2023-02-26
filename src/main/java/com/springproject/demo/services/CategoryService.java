package com.springproject.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.demo.models.Category;
import com.springproject.demo.repos.CategoryRepository;
import com.springproject.demo.request.CreateCategoryRequest;


@Service
public class CategoryService {
    @Autowired

    private CategoryRepository categoryRepository;
    

    public Category create(CreateCategoryRequest categoryRequest){

         Category category = new Category(0,categoryRequest.getName(),categoryRequest.getStatus(),categoryRequest.getType());// remember sorted in collection is important  remember that
         Category result = categoryRepository.save(category);

        return result;

        
    }
}
