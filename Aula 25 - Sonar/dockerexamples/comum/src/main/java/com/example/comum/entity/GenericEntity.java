package com.example.comum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericEntity implements Serializable {

    private static final long serialVersionUID = 806435124944809700L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime persist;

    @Column(name = "lastUpdate")
    private LocalDateTime lastUpdate;

    @PreUpdate
    void preUpdate(){
        setLastUpdate(LocalDateTime.now());
    }

    @PrePersist
    void prePersist(){
        setPersist(LocalDateTime.now());
        setLastUpdate(LocalDateTime.now());
    }
}
