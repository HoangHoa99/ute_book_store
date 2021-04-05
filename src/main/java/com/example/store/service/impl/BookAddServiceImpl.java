package com.example.store.service.impl;

import com.example.store.dto.ModelConverter;
import com.example.store.dto.request.BookAddRequest;
import com.example.store.model.BookTable;
import com.example.store.repository.BookRepository;
import com.example.store.service.BookAddService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookAddServiceImpl implements BookAddService {

    @Autowired
    BookRepository bookRepository;

    // ANCHOR - Declare constant
    private final ModelConverter modelConverter;

    @Override
    public void addNewBook(BookAddRequest request) {

        BookTable newBookTable = this.validateAndReturnNewBook(request);
        bookRepository.save(newBookTable);
    }

    /**
     * validateAndReturnNewBook
     * 
     * @param request
     * @return new book table
     */
    BookTable validateAndReturnNewBook(BookAddRequest request) {

        BookTable newBookTable = new BookTable();
        modelConverter.map(request, newBookTable);

        return newBookTable;
    }

}
