package com.boot.demo.repository;

import com.boot.demo.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> { // Long: Type of Employee ID.

}