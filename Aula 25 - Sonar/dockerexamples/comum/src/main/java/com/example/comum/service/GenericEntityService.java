package com.example.comum.service;

import com.example.comum.entity.GenericEntity;

public interface GenericEntityService<T extends GenericEntity> {
    T save(T entity);
    T findById(Long id) throws Throwable;
    void delete(Long id);
}
