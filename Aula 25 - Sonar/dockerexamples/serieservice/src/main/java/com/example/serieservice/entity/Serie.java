package com.example.serieservice.entity;

import com.example.comum.entity.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serie extends GenericEntity {

    private static final long serialVersionUID = 2745263680287977508L;

    @Column(name="name", length = 50, nullable = false, unique = true)
    private String name;

    @Column(name="genre", length = 50)
    private String genre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serie", cascade = CascadeType.ALL)
    private Set<Seasons> seasons;

}
