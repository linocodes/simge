package br.gov.mg.meioambiente.simge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "instituicao")
public class Instituicao extends BaseModel {

	private static final long serialVersionUID = 8972603309799488399L;

	@Column(name="sigla", nullable=false)
	private String sigla;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="contato", nullable=false)
	private String contato;
	
	@Column(name="contato_telefone", nullable=false)
	private String contato_telefone;
	
	@Column(name="contato_email", nullable=false)
	private String contato_email;
	
	@Column(name="observacao")
	private String observacao;
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato_nome(String contato) {
		this.contato = contato;
	}

	public String getContato_telefone() {
		return contato_telefone;
	}

	public void setContato_telefone(String contato_telefone) {
		this.contato_telefone = contato_telefone;
	}

	public String getContato_email() {
		return contato_email;
	}

	public void setContato_email(String contato_email) {
		this.contato_email = contato_email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	
}
