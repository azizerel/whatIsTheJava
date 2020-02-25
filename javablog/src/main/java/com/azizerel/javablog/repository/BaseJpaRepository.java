package com.azizerel.javablog.repository;

import com.azizerel.javablog.entity.BaseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * created by Abdulaziz Erel on 22:47 20.02.2020
 **/
@NoRepositoryBean
public interface BaseJpaRepository<M extends BaseEntity> extends CrudRepository<M, Long> {

    M saveAndFlush(M entity);

    M updateAndFlush(M entity);

    M update(M entity);
}
