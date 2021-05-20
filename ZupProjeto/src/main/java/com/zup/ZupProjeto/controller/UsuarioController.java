package com.zup.ZupProjeto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zup.ZupProjeto.model.CadastroUsuario;
import com.zup.ZupProjeto.repository.UsuarioRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
@Api(value="Zup Projetos ")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	
	@GetMapping("/{cpf}")
	public ResponseEntity<CadastroUsuario> getById(@PathVariable Long id) {
		return usuarioRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/search")
	public ResponseEntity<?> getAll() {
		List<CadastroUsuario> lista = usuarioRepository.findAll();
		
		if (!lista.isEmpty()) {
			return ResponseEntity.status(400).body(lista);
		} else {
			return ResponseEntity.badRequest().body("Usuario não encontrado, por favor confirme os dados ou cadastre-se");
		}
	}

	@PostMapping
	public ResponseEntity<CadastroUsuario> postUsuario(@Valid @RequestBody CadastroUsuario cadastroUsuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(cadastroUsuario));
		
		
	}

}