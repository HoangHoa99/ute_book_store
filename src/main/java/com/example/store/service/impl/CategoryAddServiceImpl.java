package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.CategoryAddRequest;
import com.example.store.model.CategoryTable;
import com.example.store.repository.CategoryRepository;
import com.example.store.service.CategoryAddService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryAddServiceImpl implements CategoryAddService {
    
    // ANCHOR - Decalre repo
    private final CategoryRepository categoryRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;

    @Override
    public void createNewCategory(CategoryAddRequest request) {
        
        // map request to table
        CategoryTable categoryTable = new CategoryTable();
        modelConverter.map(request, categoryTable);

        // save new category
        categoryRepository.save(categoryTable);
    }
    
}
