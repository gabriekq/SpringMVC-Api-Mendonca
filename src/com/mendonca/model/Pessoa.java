package com.mendonca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

	
	
@Id	
private Long idPerson	;
private String nome;




public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Long getIdPerson() {
	return idPerson;
}

public void setIdPerson(Long idPerson) {
	this.idPerson = idPerson;
}





	
}
