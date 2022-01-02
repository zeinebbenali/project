package com.boot.demo.controller;

import com.boot.demo.entity.Article;
import com.boot.demo.services.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping(value = "/articles")
@Slf4j
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @RequestMapping(value = "/show/{name}", method = RequestMethod.GET)
    public Article show(@PathVariable String name) {
        log.info("Start show acticles");
        return articleService.showArticle(name);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Boolean add(@PathParam("name") String name,
                       @PathParam("id") Long id) {

        return articleService.addArticle(id, name);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Boolean delete(@PathVariable Long id) {

        return articleService.deleteArticle(id);
    }
}