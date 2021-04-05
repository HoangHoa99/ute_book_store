package com.example.store.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookEntity {

    private Long id;

    private String title;

    private String author;

    private String image;

    private Long price;

    private int inStock;
}
