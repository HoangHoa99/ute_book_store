package com.example.store.service;

import com.example.store.dto.request.DiscountAddRequest;

public interface DiscountAddService {
    
    void createNewDiscount(DiscountAddRequest request);
}
