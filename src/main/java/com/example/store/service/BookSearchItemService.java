package com.example.store.service;

import com.example.store.dto.response.BookSearchItemResponse;

public interface BookSearchItemService {

    BookSearchItemResponse selectBookById(Long id);    
}
