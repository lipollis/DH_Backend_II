package com.example.serieservice.entity;

import com.example.comum.entity.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Seasons extends GenericEntity {

    private static final long serialVersionUID = -2360727954454441711L;

    @Column(name="season_number", nullable = false)
    private Integer seasonNumber;

    @ManyToOne
    @JoinColumn(name = "serie_id", nullable = false)
    private Serie serie;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seasons")
    private Set<Chapters> chapters;

}
