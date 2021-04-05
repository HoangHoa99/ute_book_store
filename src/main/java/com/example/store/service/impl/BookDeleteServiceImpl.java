package com.example.store.service.impl;

import com.example.store.constant.FlagConst;
import com.example.store.model.BookTable;
import com.example.store.repository.BookRepository;
import com.example.store.service.BookDeleteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDeleteServiceImpl implements BookDeleteService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void deleteBook(Long id) {
        
        BookTable bookTable = bookRepository.getOne(id);
        bookTable.setDelFlg(FlagConst.TRUE);

        bookRepository.save(bookTable);
    }
    
}
