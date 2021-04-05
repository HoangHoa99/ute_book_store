package com.example.store.service;

import com.example.store.dto.request.ShipFeeAddRequest;

public interface ShipFeeAddService {
    
    void createNewShipFee(ShipFeeAddRequest request);
}
