package br.com.devandrepereira.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario")
	private Long id;
	
	private String nome;
	
	@Column(name="login_usuario")
	private String login;
	
	@Column(name="senha_usuario")
	private String senha;
	
	@ManyToMany
	@JoinTable(name="relacao_usuario_grupo",
			joinColumns= 
				@JoinColumn(name="id_usuario", referencedColumnName="id_usuario"), 
			inverseJoinColumns= @JoinColumn(name="id_grupo", referencedColumnName="id_grupo"))
	private Set<Grupo> grupos;
	
	public Usuario() {
	}

	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	
	
}
