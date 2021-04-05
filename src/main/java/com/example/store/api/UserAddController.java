package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.UserAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.UserRegisterService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserAddController {

    // ANCHOR - Declare service
    private final UserRegisterService userRegisterService;
    
    @PostMapping("/register")
    public EmptyResponse create(@Valid @RequestBody UserAddRequest request){

        // execute service
        userRegisterService.createNewUser(request);

        return new EmptyResponse();
    }
}
