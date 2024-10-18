package com.api.api.service.impl;

import com.api.api.model.Orden;
import com.api.api.repository.IOrdenRepository;
import com.api.api.service.IOrdenService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

//////LOGICA DE NEGOCIO (VALIDACIONES, COMBERTIR OBJETOS, PROCESAR INFORMACION)
@NoArgsConstructor
@Service
public class OrdenServiceImpl implements IOrdenService {

    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    @Override
    public Orden findById(Integer id) {
        return ordenRepository.findById(id).orElseThrow(ResolutionException::new);
    }

    @Override
    public Orden save(Orden orden) {
        Date fechaActual=new Date();
        orden.setFechaCreacion(fechaActual);
        return ordenRepository.save(orden);
    }
}
