package com.api.api.service.impl;

import com.api.api.dto.ProductoDTO;
import com.api.api.model.Producto;
import com.api.api.repository.IProductoRepository;
import com.api.api.service.IProductoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

//////LOGICA DE NEGOCIO (VALIDACIONES, COMBERTIR OBJETOS, PROCESAR INFORMACION)
@AllArgsConstructor
@Service
public class ProductoServiceImpl implements IProductoService {

    private IProductoRepository productoRepository;
    private ModelMapper mapper;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
       return productoRepository.findById(id).orElseThrow(ResolutionException::new);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(ProductoDTO p,Integer id) {
        Producto producto=findById(id);
        mapper.map(p,producto);
        return productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
