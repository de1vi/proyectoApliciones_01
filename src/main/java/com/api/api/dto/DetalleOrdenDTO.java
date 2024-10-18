package com.api.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleOrdenDTO {
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    private Integer orden;  // ID de la orden en lugar del objeto completo
    private Integer producto;  // ID de la producto en lugar del objeto completo

}
