package com.springproject.demo.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor

public class CreateCategoryRequest {
    @Valid
    @NotNull
    private String  type;
    @NotNull
    private String name;
}
