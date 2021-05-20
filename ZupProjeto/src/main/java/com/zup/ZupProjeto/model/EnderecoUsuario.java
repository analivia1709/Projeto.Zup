package com.zup.ZupProjeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "EnderecoUsuario")
@Entity
public class EnderecoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Informe o seu endereço, por favor,este campo não pode ser nulo.")
	private String endereço;

	@NotNull(message = "Por favor, informe o tipo de logradouro,este campo não pode ser nulo.")
	private String logradouro;

	@NotNull(message = "Precisamos que você informe o seu bairro,este campo não pode ser nulo.")
	private String bairro;

	@NotNull(message = "Insira o seu estado,este campo não pode ser nulo.")
	private String estado;

	@NotNull(message = "Digite o nome da sua cidade,este campo não pode ser nulo.")
	private String cidade;

	@NotNull(message = "Por favor,insira o numero da sua residencia,este campo não pode ser nulo.")
	private String numCasa;

	@NotNull(message = "Insira o complemento,este campo não pode ser nulo.")
	private String complemento;

	@NotNull(message = "Precisamos do seu CEP, por favor, insira-o,este campo não pode ser nulo.")
	@Size(min = 8, max = 8)
	private String cep;

	@ManyToOne
	@JoinColumn(name = "cadastro_usuario_id")
	@JsonIgnoreProperties({ "enderecoUsuario" })
	private CadastroUsuario cadastroUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public CadastroUsuario getCadastroUsuario() {
		return cadastroUsuario;
	}

	public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
		this.cadastroUsuario = cadastroUsuario;
	}

}
