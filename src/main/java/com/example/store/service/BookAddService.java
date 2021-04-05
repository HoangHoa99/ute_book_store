package com.example.store.service;

import com.example.store.dto.request.BookAddRequest;

public interface BookAddService {
    void addNewBook(BookAddRequest request);
}
