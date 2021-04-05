package com.example.store.service.impl;

import com.example.store.dao.entity.BookDetailEntity;
import com.example.store.dto.ModelConverter;
import com.example.store.dto.response.BookSearchItemResponse;
import com.example.store.model.BookTable;
import com.example.store.repository.BookRepository;
import com.example.store.service.BookSearchItemService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookSearchItemServiceImpl implements BookSearchItemService {

    // ANCHOR - Declare repo
    private final BookRepository bookRepository;

    // ANCHOR - Declare const
    private final ModelConverter modelConverter;

    @Override
    public BookSearchItemResponse selectBookById(Long id) {

        // get book detail
        BookTable bookTable = bookRepository.selectBookById(id);
        // map to detail entity
        BookDetailEntity bookDetailEntity = modelConverter.map(bookTable, BookDetailEntity.class);
        bookDetailEntity.setCategoryId(bookTable.getCategoryId());
        bookDetailEntity.setPublisherId(bookTable.getPublisherId());

        // set to response
        BookSearchItemResponse response = new BookSearchItemResponse();
        response.setBook(bookDetailEntity);

        return response;
    }

}
