package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.ShipFeeAddRequest;
import com.example.store.model.ShipFeeTable;
import com.example.store.repository.ShipFeeRepository;
import com.example.store.service.ShipFeeAddService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShipFeeAddServiceImpl implements ShipFeeAddService {
    
    // ANCHOR - Declare repo
    private final ShipFeeRepository shipFeeRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;
    
    @Override
    public void createNewShipFee(ShipFeeAddRequest request) {
        
        // map request to table
        ShipFeeTable shipFeeTable = new ShipFeeTable();
        modelConverter.map(request, shipFeeTable);

        // save new ship fee
        shipFeeRepository.save(shipFeeTable);
    }
    
}
