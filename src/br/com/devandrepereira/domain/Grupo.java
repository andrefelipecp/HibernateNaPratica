package br.com.devandrepereira.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_grupo")
public class Grupo {

	@Id
	@Column(name="id_grupo")
	private Long id;
	
	@Column(name="nome_grupo")
	private String nome;
	
	@ManyToMany
	@JoinTable(name="relacao_usuario_grupo", 
			joinColumns= 
				@JoinColumn(name="id_grupo", referencedColumnName="id_grupo"), 
			inverseJoinColumns= @JoinColumn(name="id_usuario", referencedColumnName="id_usuario") )
	private Set<Usuario> usuarios;
	
	@OneToMany(mappedBy="id.grupo")
	private Set<GrupoPermissao> grupoPermissoes;

}
