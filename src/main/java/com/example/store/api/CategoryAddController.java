package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.CategoryAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.CategoryAddService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryAddController {

    // ANCHOR - Declare service
    private final CategoryAddService categoryAddService;

    @PostMapping("/add")
    public EmptyResponse create(@Valid @RequestBody CategoryAddRequest request) {

        // execute add new category
        categoryAddService.createNewCategory(request);

        return new EmptyResponse();
    }
}
