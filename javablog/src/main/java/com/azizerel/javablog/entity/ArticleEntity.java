package com.azizerel.javablog.entity;

import com.azizerel.javablog.constraints.ArticleConstraints;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * created by Abdulaziz Erel on 21:21 10.02.2020
 **/
@Entity
@Table(name = ArticleConstraints.TABLE_NAME, schema = ArticleConstraints.SCHEMA_NAME)
@Getter
@Setter
public class ArticleEntity extends BaseEntity {

    @NotNull
    @Column(name = "CAPTION")
    @Size(max = ArticleConstraints.ARTICLE_CAPTION_MAX_SIZE, min = ArticleConstraints.ARTICLE_CAPTION_MIN_SIZE)
    private String caption;

    @NotNull
    @Column(name = "CONTENT")
    @Size(max = ArticleConstraints.ARTICLE_CONTENT_MAX_SIZE, min = ArticleConstraints.ARTICLE_CONTENT_MIN_SIZE)
    private String content;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "ARTICLE_DATE")
    private Date articleDate;

    @NotNull
    @Column(name = "AUTHOR")
    private String author;
}
