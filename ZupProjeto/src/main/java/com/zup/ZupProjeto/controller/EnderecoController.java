package com.zup.ZupProjeto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.ZupProjeto.model.EnderecoUsuario;
import com.zup.ZupProjeto.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
@CrossOrigin("*")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;


	@PostMapping
	public ResponseEntity<EnderecoUsuario> postEndereco(@Valid @RequestBody EnderecoUsuario enderecoUsuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoRepository.save(enderecoUsuario));
	}
	
	@GetMapping
	public ResponseEntity<List<EnderecoUsuario>> GetAll() {
		return ResponseEntity.ok(enderecoRepository.findAll());
	}

	
	

}
