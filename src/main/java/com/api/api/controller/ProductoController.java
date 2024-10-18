package com.api.api.controller;

import com.api.api.dto.ProductoDTO;
import com.api.api.model.Producto;
import com.api.api.service.IProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/producto")
@RestController
public class ProductoController {

    private IProductoService productoService;

    @GetMapping("")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id){
        return productoService.findById(id);
    }

    @PostMapping("")
    public Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @PutMapping("/{id}")
    public Producto update(@RequestBody ProductoDTO productoDTO,@PathVariable Integer id){
        return productoService.update(productoDTO,id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        productoService.delete(id);
    }

}
