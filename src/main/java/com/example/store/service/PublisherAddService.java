package com.example.store.service;

import com.example.store.dto.request.PublisherAddRequest;

public interface PublisherAddService {
    
    void createNewPublisher(PublisherAddRequest request);
}
