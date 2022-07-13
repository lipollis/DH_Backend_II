package com.checkpoint.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "movie")
@Entity
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
