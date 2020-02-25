package com.azizerel.javablog.service;

import com.azizerel.javablog.common.ArticleModel;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * created by Abdulaziz Erel on 21:16 17.02.2020
 **/
@Validated
public interface ArticleService {

    ArticleModel saveArticle(@Valid ArticleModel articleModel);

    ArticleModel updateArticle(@Valid ArticleModel articleModel);

    void deleteById(@NotNull @Positive Long id);

    ArticleModel findById(@NotNull @Positive Long id);
}
