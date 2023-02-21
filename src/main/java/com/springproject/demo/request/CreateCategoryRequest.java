package com.springproject.demo.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor

public class CreateCategoryRequest {
    
    @NotNull
    private String  type;
    @NotNull
    private String name;
}
