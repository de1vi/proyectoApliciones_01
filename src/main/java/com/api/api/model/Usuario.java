package com.api.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellidos;
    private Date fecNacimiento;
    private String email;
    private String password;
    //relacion de tablas

    //@OneToMany(mappedBy = "usuario")
    //private List<Producto> productos;
    //@OneToMany(mappedBy = "usuario")
    //private List<Orden> ordenes;

}
