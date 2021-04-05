package com.example.store.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookAddRequest {

    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String image;

    @NotBlank
    private String author;

    @NotNull
    private Long categoryId;

    @Positive
    @NotNull
    private Long price;

    @Positive
    private int inStock;

    @NotNull
    private Long publisherId;
}
