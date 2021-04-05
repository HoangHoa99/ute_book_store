package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.DiscountAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.DiscountAddService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/discount")
@RequiredArgsConstructor
public class DiscountAddController {
    
    // ANCHOR - Declare service
    private final DiscountAddService discountAddService;
    
    @PostMapping("/add")
    public EmptyResponse create(@Valid @RequestBody DiscountAddRequest request){

        // execute add new category
        discountAddService.createNewDiscount(request);

        return new EmptyResponse();
    }
}
