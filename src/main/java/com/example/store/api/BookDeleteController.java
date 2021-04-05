package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.BookDeleteRequest;
import com.example.store.dto.response.EmptyResponse;
import com.example.store.service.BookDeleteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookDeleteController {

    private final BookDeleteService bookDeleteService;

    @PostMapping("/delete")
    public EmptyResponse delete(@Valid @RequestBody BookDeleteRequest request) {

        bookDeleteService.deleteBook(request.getId());

        return new EmptyResponse();
    }
}
