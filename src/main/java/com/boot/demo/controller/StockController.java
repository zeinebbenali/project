package com.boot.demo.controller;

import com.boot.demo.services.service.ArticleService;
import com.boot.demo.services.service.StockeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/magazin")
public class StockController {
    private final StockeService stockeService;

    public StockController(StockeService stockeService) {
        this.stockeService = stockeService;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String show(@PathVariable String name) {
        return "Hello " + name;
    }

}