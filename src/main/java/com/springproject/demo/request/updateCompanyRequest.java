package com.springproject.demo.request;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter  @AllArgsConstructor @NoArgsConstructor @Getter

public class updateCompanyRequest {
    @NotNull
    private String name;
}
