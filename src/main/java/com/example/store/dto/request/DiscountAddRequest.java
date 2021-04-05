package com.example.store.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DiscountAddRequest {
    
    @NotBlank
    private String name;

    @Min(0)
    @NotNull
    private Long value;
}
