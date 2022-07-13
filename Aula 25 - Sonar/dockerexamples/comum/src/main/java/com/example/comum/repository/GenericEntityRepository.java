package com.example.comum.repository;

import com.example.comum.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericEntityRepository<T extends GenericEntity> extends JpaRepository<T, Long> {
}
