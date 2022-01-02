package com.boot.demo.services.service;

import com.boot.demo.entity.Article;

public interface ArticleService {
    Article showArticle(String name);

    Boolean addArticle(Long id, String name);

    Boolean deleteArticle(Long id);
}

