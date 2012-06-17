package br.com.devandrepereira.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class GrupoPermissaoId implements Serializable{

	@ManyToOne
	@JoinColumn(name="id_permissao")
	private Permissao permissao;
	
	@ManyToOne
	@JoinColumn(name="id_grupo")
	private Grupo grupo;
	
	public GrupoPermissaoId() {
	}

}
