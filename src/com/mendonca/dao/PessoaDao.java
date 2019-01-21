package com.mendonca.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import com.mendonca.model.Pessoa;




@Repository
public class PessoaDao {

	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Pessoa pessoa){
		manager.persist(pessoa);
	}
	
	
	public List<Pessoa> getPessoas(){
		
		 
		return  (List<Pessoa>)  manager.createQuery("SELECT p FROM Pessoa p").getResultList();
	}
	
	
	public Pessoa getOne(Long id){
		
	  return manager.find(Pessoa.class, id);
		
	}
	
	
	
	
	
}
