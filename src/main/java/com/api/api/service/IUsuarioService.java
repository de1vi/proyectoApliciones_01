package com.api.api.service;

import com.api.api.dto.UsuarioDTO;
import com.api.api.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    //GET
    List<Usuario> findAll();
    Usuario findById(Integer id);
    //POST
    Usuario save(Usuario usuario);
    //put
    Usuario update(UsuarioDTO usuario, Integer id);
    //delete
    void delete(Integer id);
    //inicio sesion con correo
    //Usuario findByEmailAndPassword(String email, String password);
    Optional<Usuario> findByEmail(String email, String password);
}
