package com.api.api.service;

import com.api.api.model.Orden;

import java.util.List;

public interface IOrdenService {
    //GET
    List<Orden> findAll();
    Orden findById(Integer id);
    //POST
    Orden save(Orden orden);
}
