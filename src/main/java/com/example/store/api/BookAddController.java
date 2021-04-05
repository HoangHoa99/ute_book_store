package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.BookAddRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.BookAddService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookAddController {

    private final BookAddService bookAddService;

    @PostMapping("/add")
    public EmptyResponse add(@Valid @RequestBody BookAddRequest request) {

        bookAddService.addNewBook(request);

        return new EmptyResponse();
    }
}
