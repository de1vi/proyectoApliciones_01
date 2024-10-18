package com.api.api.service.impl;

import com.api.api.dto.DetalleOrdenDTO;
import com.api.api.model.DetalleOrden;
import com.api.api.model.Orden;
import com.api.api.model.Producto;
import com.api.api.repository.IDetalleRepository;
import com.api.api.repository.IOrdenRepository;
import com.api.api.repository.IProductoRepository;
import com.api.api.service.IDetalleService;
import com.api.api.service.IProductoService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//////LOGICA DE NEGOCIO (VALIDACIONES, COMBERTIR OBJETOS, PROCESAR INFORMACION)
@NoArgsConstructor
@Service
public class DetalleServiceImpl implements IDetalleService {

    @Autowired
    private IDetalleRepository detalleRepository;
    @Autowired
    private IOrdenRepository ordenRepository;
    @Autowired
    private IProductoRepository productoRepository;


    @Override
    public List<DetalleOrden> findAll() {
        return detalleRepository.findAll();
    }

    @Override
    public DetalleOrden save(DetalleOrdenDTO detalleOrdenDTO) {
        Orden orden = ordenRepository.findById(detalleOrdenDTO.getOrden()).get();
        Producto producto=productoRepository.findById(detalleOrdenDTO.getProducto()).get();

        DetalleOrden detalleOrden=new DetalleOrden();

        detalleOrden.setNombre(detalleOrdenDTO.getNombre());
        detalleOrden.setCantidad(detalleOrdenDTO.getCantidad());
        detalleOrden.setPrecio(detalleOrdenDTO.getPrecio());
        detalleOrden.setTotal(detalleOrdenDTO.getTotal());
        detalleOrden.setOrden(orden);  // Asigna la orden obtenida
        detalleOrden.setProducto(producto);  // Asigna el producto obtenido

        // Guarda y retorna el DetalleOrden
        return detalleRepository.save(detalleOrden);
    }
}
