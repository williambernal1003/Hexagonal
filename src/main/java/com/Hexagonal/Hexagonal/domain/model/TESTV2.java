package com.Hexagonal.Hexagonal.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TESTV2", schema = "dbo")
public class TESTV2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "Descripcion")
    @Getter
    @Setter
    private String descripcion;
}