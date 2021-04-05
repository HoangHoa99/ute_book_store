package com.example.store.repository;

import java.util.List;

import com.example.store.model.BookTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookTable, Long> {

    @Query(value = "SELECT * FROM tb_books WHERE del_flg = '0'", nativeQuery = true)
    List<BookTable> selectListBook();

    @Query(value = "SELECT * FROM tb_books WHERE id = ?1 AND del_flg = '0'", nativeQuery = true)
    BookTable selectBookById(Long id);
}
