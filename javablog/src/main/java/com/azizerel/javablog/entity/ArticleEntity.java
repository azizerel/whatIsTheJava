package com.azizerel.javablog.entity;

import com.azizerel.javablog.constraints.ArticleConstraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created by Abdulaziz Erel on 21:21 10.02.2020
 **/
@Entity
@Table(name = ArticleConstraints.TABLE_NAME ,schema = "test")
public class ArticleEntity extends BaseEntity {

    @Column(name = "Name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
