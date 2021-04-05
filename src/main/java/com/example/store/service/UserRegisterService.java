package com.example.store.service;

import com.example.store.dto.request.UserAddRequest;

public interface UserRegisterService {
    void createNewUser(UserAddRequest request);
}
