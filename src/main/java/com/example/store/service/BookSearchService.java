package com.example.store.service;

import com.example.store.dto.response.BookSearchResponse;

public interface BookSearchService {

    BookSearchResponse getListBook();

    BookSearchResponse paginateListBook(int page, int size);
}
