package com.bezkoder.spring.jpa.postgresql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.jpa.postgresql.model.Tutorial;
import com.bezkoder.spring.jpa.postgresql.model.Usuarios;
import com.bezkoder.spring.jpa.postgresql.repository.TutorialRepository;
import com.bezkoder.spring.jpa.postgresql.repository.UsuariosRepository;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class UsuariosController {
	
	@Autowired
	UsuariosRepository usuariosRepository;

	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuarios>> getAllUsers() {
		try {
			List<Usuarios> usuarios = new ArrayList<Usuarios>();
				usuariosRepository.findAll();
	
			if (usuariosRepository.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	

	@PostMapping("/usuario")
	public ResponseEntity<Usuarios> createUsuario(@RequestBody Usuarios usuarios) {
		try {
			Usuarios _usuario = usuariosRepository
					.save(new Usuarios(usuarios.getName(), usuarios.getPassword() , usuarios.getEmail()));
			return new ResponseEntity<>(_usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	
	
}
