package br.com.devandrepereira.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="relacao_grupo_permissao")
public class GrupoPermissao {

	@EmbeddedId
	private GrupoPermissaoId id;
	
	public GrupoPermissao() {
	}
}
