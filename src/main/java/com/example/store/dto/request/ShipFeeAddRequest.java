package com.example.store.dto.request;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ShipFeeAddRequest {
    
    @NotNull
    private Long distance;

    @NotNull
    private Long fee;
}
