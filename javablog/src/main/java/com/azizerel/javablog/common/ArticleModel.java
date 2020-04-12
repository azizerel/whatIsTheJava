package com.azizerel.javablog.common;

import com.azizerel.javablog.constraints.ArticleConstraints;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * created by Abdulaziz Erel on 21:19 10.02.2020
 **/
@Getter
@Setter
public class ArticleModel extends BaseModel {

    @NotNull
    @Size(max = ArticleConstraints.ARTICLE_CAPTION_MAX_SIZE, min = ArticleConstraints.ARTICLE_CAPTION_MIN_SIZE)
    private String caption;

    @NotNull
    @Size(max = ArticleConstraints.ARTICLE_CONTENT_MAX_SIZE, min = ArticleConstraints.ARTICLE_CONTENT_MIN_SIZE)
    private String content;

    @NotNull
    private Date articleDate;

    @NotNull
    private String author;

}
