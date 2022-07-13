package com.lipollis.serieservice.domain.exception;

public class SerieNotFoundException extends RuntimeException {
    public SerieNotFoundException(Long id) {
        super("Movie with id " + id + " not found");
    }
}
