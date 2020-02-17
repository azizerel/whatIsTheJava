package com.azizerel.javablog.entity;

import com.azizerel.javablog.constraints.ArticleConstraints;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created by Abdulaziz Erel on 21:21 10.02.2020
 **/
@Entity
@Table(name = ArticleConstraints.TABLE_NAME, schema = "test")
@Getter
@Setter
public class ArticleEntity extends BaseEntity {

    @Column(name = "NAME")
    private String name;
}
