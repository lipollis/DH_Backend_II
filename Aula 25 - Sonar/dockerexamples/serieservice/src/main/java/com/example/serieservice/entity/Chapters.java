package com.example.serieservice.entity;


import com.example.comum.entity.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Chapters extends GenericEntity {

    @Column(name="name", length = 50, nullable = false)
    private String name;

    @Column(name="url_stream")
    private String urlStream;

    @Column(name="number", nullable = false)
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "seasons_id", nullable = false)
    private Seasons seasons;

}
