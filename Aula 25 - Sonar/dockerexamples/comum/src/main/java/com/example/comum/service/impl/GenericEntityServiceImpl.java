package com.example.comum.service.impl;

import com.example.comum.entity.GenericEntity;
import com.example.comum.repository.GenericEntityRepository;
import com.example.comum.service.GenericEntityService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public abstract class GenericEntityServiceImpl<T extends GenericEntity> implements GenericEntityService<T> {

    protected abstract GenericEntityRepository<T> getRepository();

    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T findById(Long id) throws Throwable {
        return getRepository().findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void delete(Long id) {
        getRepository().deleteById(id);
    }
}
