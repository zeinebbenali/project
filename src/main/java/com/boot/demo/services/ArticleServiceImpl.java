package com.boot.demo.services;

import com.boot.demo.entity.Article;
import com.boot.demo.services.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Article showArticle(String name) {
        log.info("Show an article {}", name);
        return Article.builder().name(name).build();
    }

    @Override
    public Boolean addArticle(Long id, String name) {
        log.info("Add a new article");
        return true;
    }

    @Override
    public Boolean deleteArticle(Long id) {
        log.info("Delete an article {}", id);
        return true;
    }
}
