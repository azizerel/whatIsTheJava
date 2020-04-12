package com.azizerel.javablog.constraints;

/**
 * created by Abdulaziz Erel on 21:22 10.02.2020
 **/
public class ArticleConstraints {
    public static final String  TABLE_NAME = "BLOG_ARTICLE";
    public static final String  SCHEMA_NAME = "BLOG";

    public static final int ARTICLE_CAPTION_MAX_SIZE = 200;
    public static final int ARTICLE_CAPTION_MIN_SIZE = 2;

    public static final int ARTICLE_CONTENT_MIN_SIZE = 2;
    public static final int ARTICLE_CONTENT_MAX_SIZE = 4000;

}
