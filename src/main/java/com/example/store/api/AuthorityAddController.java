package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.AuthorityAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.AuthorityAddService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/authority")
@RequiredArgsConstructor
public class AuthorityAddController {
    
    // ANCHOR - Declare service
    private final AuthorityAddService authorityAddService;

    @PostMapping("/add")
    public EmptyResponse create(@Valid @RequestBody AuthorityAddRequest request){
        // execute
        authorityAddService.createNewAuth(request);

        return new EmptyResponse();
    }
}
