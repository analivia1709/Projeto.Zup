package com.zup.ZupProjeto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zup.ZupProjeto.model.CadastroUsuario;

@Repository
public interface UsuarioRepository extends JpaRepository<CadastroUsuario, Long> {

	public List<CadastroUsuario> findAllByEnderecoUsuario(String nome);
		
	public List<CadastroUsuario> findByCpf (String cpf);
	
	public List<CadastroUsuario> findByEmail(String email);
	
	public List<CadastroUsuario> getByCpf (String cpf);

	public Optional<CadastroUsuario> findById(Long id);




}
