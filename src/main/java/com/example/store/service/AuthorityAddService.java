package com.example.store.service;

import com.example.store.dto.request.AuthorityAddRequest;

public interface AuthorityAddService {
    
    void createNewAuth(AuthorityAddRequest request);
}
