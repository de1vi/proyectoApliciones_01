package com.api.api.service;

import com.api.api.dto.ProductoDTO;
import com.api.api.model.Producto;

import java.util.List;

public interface IProductoService {
    //get
    List<Producto> findAll();
    Producto findById(Integer id);
    //post
    Producto save(Producto producto);
    //put
    Producto update(ProductoDTO producto, Integer id);
    //delete
    void delete(Integer id);
}
