package br.com.devandrepereira.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_permissao")
public class Permissao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_permissao")
	private Long id;
	
	@Column(name="nome_permissao")
	private String nomePermissao;
	
	@OneToMany(mappedBy="id.permissao")
	private Set<GrupoPermissao> grupoPermissoes;
	
}
