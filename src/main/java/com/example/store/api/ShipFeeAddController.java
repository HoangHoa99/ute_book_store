package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.ShipFeeAddRequest;
import com.example.store.dto.response.EmptyResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ship-fee")
@RequiredArgsConstructor
public class ShipFeeAddController {
    
    @PostMapping("/add")
    public EmptyResponse create(@Valid @RequestBody ShipFeeAddRequest request){

        return new EmptyResponse();
    }
}
