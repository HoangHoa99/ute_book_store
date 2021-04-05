package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.PublisherAddRequest;
import com.example.store.model.PublisherTable;
import com.example.store.repository.PublisherRepository;
import com.example.store.service.PublisherAddService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PublisherAddServiceImpl implements PublisherAddService {
    
    // ANCHOR - Declare repo
    private final PublisherRepository publisherRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;
    
    @Override
    public void createNewPublisher(PublisherAddRequest request) {
        
        // map request to table
        PublisherTable publisherTable = new PublisherTable();
        modelConverter.map(request, publisherTable);

        // save new publisher
        publisherRepository.save(publisherTable);
    }
    
}
