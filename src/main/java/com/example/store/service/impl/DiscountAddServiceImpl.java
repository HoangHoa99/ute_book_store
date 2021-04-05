package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.DiscountAddRequest;
import com.example.store.model.DiscountTable;
import com.example.store.repository.DiscountRepository;
import com.example.store.service.DiscountAddService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DiscountAddServiceImpl implements DiscountAddService {

    // ANCHOR - Declare repo
    private final DiscountRepository discountRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;
    
    @Override
    public void createNewDiscount(DiscountAddRequest request) {
        
        // map request to table
        DiscountTable discountTable = new DiscountTable();
        modelConverter.map(request, discountTable);

        // save new discount
        discountRepository.save(discountTable);
    }
    
}
