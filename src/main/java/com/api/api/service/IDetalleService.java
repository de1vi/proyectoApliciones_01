package com.api.api.service;

import com.api.api.dto.DetalleOrdenDTO;
import com.api.api.model.DetalleOrden;

import java.util.List;

public interface IDetalleService {
    //GET
    List<DetalleOrden> findAll();
    //POST
    DetalleOrden save(DetalleOrdenDTO detalleOrden);
}
