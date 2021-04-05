package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.RoleAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.RoleAddService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleAddController {

    // ANCHOR - Declare service
    private final RoleAddService roleAddService;
    
    @PostMapping("/add")
    public EmptyResponse create(@Valid @RequestBody RoleAddRequest request){

        // execute service
        roleAddService.createNewRole(request);

        return new EmptyResponse();
    }
}
