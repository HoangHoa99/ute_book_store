package com.example.store.service;

import com.example.store.dto.request.CategoryAddRequest;

public interface CategoryAddService {
    
    void createNewCategory(CategoryAddRequest request);
}
