package com.zup.ZupProjeto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.ZupProjeto.model.EnderecoUsuario;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoUsuario, Long> {

	public List<EnderecoUsuario> findAllByCadastroUsuario(EnderecoUsuario enderecoUsuario);
	
	
}
