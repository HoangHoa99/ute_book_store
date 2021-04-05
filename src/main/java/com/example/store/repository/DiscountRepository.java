package com.example.store.repository;

import com.example.store.model.DiscountTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface DiscountRepository extends JpaRepository<DiscountTable, Long> {
    
}
