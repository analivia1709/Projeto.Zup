package com.zup.ZupProjeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;

@Entity
@Table(name = " tb_usuario")
public class CadastroUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Preciso de um nome. Como devo te chamar?")
	@Size(min = 3, max = 30)
	private String nome;

	@NotNull(message = "Para entramos em contato infome o seu email.")
	@Column(unique = true)
	@Email
	private String email;

	@NotNull(message = "Insira um cpf válido, por favor!")
	@Column(unique = true)
	@Size(min = 11, max = 11)
	private String cpf;

	@NotNull(message = "Por favor, insira sua data de nascimento!")
	@Size(min = 10, max = 10)
	private String dataDeNascimento;

	@OneToMany(mappedBy = "cadastroUsuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "cadastroUsuario" })
	private List<EnderecoUsuario> enderecoUsuario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getIdUsuario() {
		return id;
	}

	public void setIdUsuario(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<EnderecoUsuario> getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(List<EnderecoUsuario> enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}

}
