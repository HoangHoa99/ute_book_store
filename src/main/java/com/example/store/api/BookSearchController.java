package com.example.store.api;

import javax.validation.Valid;

import com.example.store.dto.request.BaseRequest;
import com.example.store.dto.request.BookSearchRequest;
import com.example.store.dto.response.BookSearchResponse;
import com.example.store.service.BookSearchService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookSearchController {

    private final BookSearchService bookSearchService;

    @PostMapping("/search")
    public BookSearchResponse search(@Valid @RequestBody BaseRequest request) {

        return bookSearchService.getListBook();
    }

    @PostMapping("/paginate/search")
    public BookSearchResponse paginateSearch(@Valid @RequestBody BookSearchRequest request) {

        return bookSearchService.paginateListBook(request.getPage(), request.getSize());
    }
}
