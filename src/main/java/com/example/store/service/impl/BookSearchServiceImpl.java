package com.example.store.service.impl;

import java.util.List;

import com.example.store.constant.FlagConst;
import com.example.store.dao.entity.BookEntity;
import com.example.store.dto.ModelConverter;
import com.example.store.dto.response.BookSearchResponse;
import com.example.store.model.BookTable;
import com.example.store.repository.BookRepository;
import com.example.store.repository.BookSearchRepository;
import com.example.store.service.BookSearchService;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookSearchServiceImpl implements BookSearchService {

    // ANCHOR - Declare repository
    private final BookRepository bookRepository;
    private final BookSearchRepository bookSearchRepository;

    // ANCHOR - Declare constant
    private final ModelConverter modelConverter;

    @Override
    public BookSearchResponse getListBook() {
        List<BookTable> bookTables = bookRepository.selectListBook();
        List<BookEntity> bookEntities = modelConverter.mapAllByIterator(bookTables, BookEntity.class);

        BookSearchResponse response = new BookSearchResponse();
        response.setBookList(bookEntities);

        return response;
    }

    @Override
    public BookSearchResponse paginateListBook(int page, int size) {
        // init paginate request
        Pageable pageRequest = PageRequest.of(page - 1, size, Sort.Direction.ASC, "id");

        // search paginate book list
        List<BookTable> bookTables = bookSearchRepository.findByDelFlg(FlagConst.FALSE, pageRequest).getContent();
        List<BookEntity> bookEntities = modelConverter.mapAllByIterator(bookTables, BookEntity.class);

        // map to response
        BookSearchResponse response = new BookSearchResponse();
        response.setBookList(bookEntities);

        return response;
    }

}
