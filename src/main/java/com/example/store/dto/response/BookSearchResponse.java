package com.example.store.dto.response;

import java.util.List;

import com.example.store.dao.entity.BookEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookSearchResponse extends BaseResponse{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private List<BookEntity> bookList;    
}
