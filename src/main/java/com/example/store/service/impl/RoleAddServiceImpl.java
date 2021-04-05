package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.RoleAddRequest;
import com.example.store.model.RoleTable;
import com.example.store.repository.RoleRepository;
import com.example.store.service.RoleAddService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleAddServiceImpl implements RoleAddService {

    // ANCHOR - Declare repo
    private final RoleRepository roleRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;
    
    @Override
    public void createNewRole(RoleAddRequest request) {
        
        // map request to table
        RoleTable roleTable = new RoleTable();
        modelConverter.map(request, roleTable);
        
        // save new role
        roleRepository.save(roleTable);
    }
    
}
