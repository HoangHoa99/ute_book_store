package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.BookSearchItemRequest;
import com.example.store.dto.response.BookSearchItemResponse;
import com.example.store.service.BookSearchItemService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookSearchItemController {

    private final BookSearchItemService bookSearchItemService;

    @PostMapping("/search/item")
    public BookSearchItemResponse searchItem(@Valid @RequestBody BookSearchItemRequest request) {
        return bookSearchItemService.selectBookById(request.getId());
    }
}
