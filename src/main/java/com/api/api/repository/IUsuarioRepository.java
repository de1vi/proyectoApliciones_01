package com.api.api.repository;

import com.api.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

    Optional<Usuario> findByEmailAndPassword(String email, String password);

    Optional<Usuario> findByEmail(String email);
}
