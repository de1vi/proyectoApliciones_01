package com.api.api.controller;

import com.api.api.dto.DetalleOrdenDTO;
import com.api.api.model.DetalleOrden;
import com.api.api.model.Orden;
import com.api.api.service.IDetalleService;
import com.api.api.service.IOrdenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/orden")
@RestController
public class OrdenController {

    private IOrdenService ordenService;
    private IDetalleService detalleService;

    @GetMapping("")
    public List<Orden> findAll(){
        return ordenService.findAll();
    }
    @GetMapping("/{id}")
    public Orden findById(@PathVariable Integer id){
        return ordenService.findById(id);
    }
    @PostMapping("")
    public Orden save(@RequestBody Orden orden){
        return ordenService.save(orden);
    }
    ///DETALLESS------------
    @GetMapping("/detalle")
    public List<DetalleOrden> findAllDetalles(){
        return detalleService.findAll();
    }

    @PostMapping("/detalle")
    public DetalleOrden saveDetalle(@RequestBody DetalleOrdenDTO detalle){
        return detalleService.save(detalle);
    }


}
