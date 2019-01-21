package com.mendonca.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;
import org.w3c.dom.ls.LSInput;

import com.mendonca.dao.PessoaDao;
import com.mendonca.model.Pessoa;




@Controller
@Transactional
public class HomeController {

	// codigo de exemplo para ir aperfesoando
	
	@Autowired
	private PessoaDao dao;
	
	
	@RequestMapping("/home")
	public String index(){
		
		System.out.println("Carregando Pagina");
		return "Hello";
		
	}
	
	@RequestMapping("/nomes")
	public String save(Pessoa pessoa){
		
		
		System.out.println("You push the button ->  "+pessoa.getNome());
		return index();
	}
	
	
	
	
	
	
	// Methond below are restfull 
	
	
	//get everone
	@RequestMapping(method = RequestMethod.GET,value = "pessoas")
	@ResponseBody
	public List<Pessoa> ListaPessoa(){
	List<Pessoa> pessoas;
  	pessoas = dao.getPessoas();
  	return pessoas;
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value="savePessoa")
	@ResponseBody
	public void savePessoa(@RequestBody Pessoa pessoa, UriComponentsBuilder ucBuilder ){
		
		System.out.println("Objeto pessoa: "+pessoa);
		System.out.println(pessoa.getNome());
		dao.save(pessoa);
	}
	

	@RequestMapping(method = RequestMethod.GET,value="getBy/{id}")
	@ResponseBody
	public Pessoa getOnePerson(@PathVariable("id") String id){
		
		Pessoa pessoa = dao.getOne( Long.parseLong(id));
	    System.out.println(pessoa.getNome()); 
	    
	    return pessoa;
		
	}
	
	
}
