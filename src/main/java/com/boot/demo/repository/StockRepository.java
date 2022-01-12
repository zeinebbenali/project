package com.boot.demo.repository;

import com.boot.demo.entity.Article;
import com.boot.demo.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> { // Long: Type of Employee ID.

}