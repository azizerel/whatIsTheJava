package com.azizerel.javablog.repository;

import com.azizerel.javablog.entity.BaseEntity;

import java.util.Optional;

/**
 * created by Abdulaziz Erel on 22:50 20.02.2020
 **/
public class BaseJpaRepositoryImpl<M extends BaseEntity> implements BaseJpaRepository<M> {
    @Override
    public M saveAndFlush(M entity) {

        return null;
    }

    @Override
    public M updateAndFlush(M entity) {
        return null;
    }

    @Override
    public M update(M entity) {
        return null;
    }

    @Override
    public <S extends M> S save(S entity) {
        return null;
    }

    @Override
    public <S extends M> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<M> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<M> findAll() {
        return null;
    }

    @Override
    public Iterable<M> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(M entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends M> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
