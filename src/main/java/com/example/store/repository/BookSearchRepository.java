package com.example.store.repository;

import com.example.store.model.BookTable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public interface BookSearchRepository extends JpaRepository<BookTable, Long> {

    Page<BookTable> findByDelFlg(String delFlg, Pageable pageable);
}
