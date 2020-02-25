package com.azizerel.javablog.repository;

import com.azizerel.javablog.entity.ArticleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Abdulaziz Erel on 21:20 10.02.2020
 **/
@Repository
public interface ArticleRepository extends CrudRepository<ArticleEntity,Long> {
}
