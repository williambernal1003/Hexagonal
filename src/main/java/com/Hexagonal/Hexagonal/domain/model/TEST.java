package com.Hexagonal.Hexagonal.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TEST", schema = "dbo")
public class TEST {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "Nombre_Usuario")
    @Getter
    @Setter
    private String nombre;

    @Column(name = "Apellido_User")
    @Getter
    @Setter
    private String apellido;

    @Column(name = "Telefono")
    @Getter
    @Setter
    private String Telefono;

    @ManyToOne
    @JoinColumn(name = "idTEST", referencedColumnName = "id")
    @Getter
    @Setter
    private TESTV2 testv2;
}