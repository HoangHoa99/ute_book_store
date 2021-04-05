package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.AuthorityAddRequest;
import com.example.store.model.AuthorityTable;
import com.example.store.repository.AuthorityRepository;
import com.example.store.service.AuthorityAddService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorityAddServiceImpl implements AuthorityAddService {

    // ANCHOR - Declare repo
    private final AuthorityRepository authorityRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;

    @Override
    public void createNewAuth(AuthorityAddRequest request) {

        // map request to table
        AuthorityTable authorityTable = new AuthorityTable();
        modelConverter.map(request, authorityTable);

        // save new authority
        authorityRepository.save(authorityTable);
    }
    
}
