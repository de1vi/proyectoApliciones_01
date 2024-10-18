package com.api.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UsuarioDTO {
    private String nombre;
    private String apellidos;
    private Date fecNacimiento;
    private String email;
    private String password;
}
