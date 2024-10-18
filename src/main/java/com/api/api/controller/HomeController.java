package com.api.api.controller;

import com.api.api.model.Orden;
import com.api.api.service.IOrdenService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@AllArgsConstructor
@Controller
@RequestMapping("/ordenes")
public class HomeController {


    private IOrdenService ordenService;

    @GetMapping("")
    public String ordenes(Model model){
        List<Orden> listaOrden=ordenService.findAll();
        model.addAttribute("ordenes",listaOrden);
        return "orden/detalleCompra.html";
    }

}
