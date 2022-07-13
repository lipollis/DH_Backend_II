package com.example.serieservice.repository;

import com.example.comum.repository.GenericEntityRepository;
import com.example.serieservice.entity.Serie;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends GenericEntityRepository<Serie> {

}
