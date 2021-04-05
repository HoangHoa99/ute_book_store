package com.example.store.dto.response;

import com.example.store.dao.entity.BookDetailEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookSearchItemResponse extends BaseResponse {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private BookDetailEntity book;
    
}
