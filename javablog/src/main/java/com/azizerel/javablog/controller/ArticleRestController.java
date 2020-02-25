package com.azizerel.javablog.controller;

import com.azizerel.javablog.entity.ArticleEntity;
import com.azizerel.javablog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Abdulaziz Erel on 21:27 10.02.2020
 **/
@RestController
public class ArticleRestController {

    @Autowired
    private ArticleRepository repository;

    @GetMapping("/javablog")
    public String bulkcreate() {
        ArticleEntity articleEntity = new ArticleEntity();
        repository.save(articleEntity);

        return "Customers are created";
    }

}
