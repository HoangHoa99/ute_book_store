package com.example.store.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CategoryAddRequest {
    
    @NotBlank
    private String name;
}
