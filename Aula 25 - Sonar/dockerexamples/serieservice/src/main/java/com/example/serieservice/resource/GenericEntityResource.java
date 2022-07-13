package com.example.serieservice.resource;

import com.example.comum.entity.GenericEntity;
import com.example.comum.service.GenericEntityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class GenericEntityResource<T extends GenericEntity> {

    abstract protected GenericEntityService<T> getService();


    @PostMapping
    private ResponseEntity<T> save (@RequestBody T entity) {
        T entityAux = getService().save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityAux);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<T> findById (@PathVariable Long id) throws Throwable {
        return ResponseEntity.ok(getService().findById(id));
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id) {
        getService().delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
