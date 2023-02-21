package com.springproject.demo.request;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter  @AllArgsConstructor @NoArgsConstructor @Getter

public class CreateCategoryRequest {
    @Valid
    @NotNull
    private String  status;
    @NotNull
    private String name;
}
