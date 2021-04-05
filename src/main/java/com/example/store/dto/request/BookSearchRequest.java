package com.example.store.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookSearchRequest {

    private int page;

    private int size;
}
