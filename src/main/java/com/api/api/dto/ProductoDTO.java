package com.api.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {

    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
}
