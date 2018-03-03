package com.algawork.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.patrimonio.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
