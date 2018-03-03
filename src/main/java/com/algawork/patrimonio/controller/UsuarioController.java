package com.algawork.patrimonio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.patrimonio.model.Usuario;
import com.algawork.patrimonio.repository.UsuarioRepository;

@RestController
@CrossOrigin("${origem-permitida}")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}
	
	@PostMapping("/usuarios")
	public Usuario adicionar(@RequestBody @Valid Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
