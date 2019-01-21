package com.mendonca.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mendonca.dao.PessoaDao;



@Configuration
public class DaoConfTest {

	
	@Bean
	PessoaDao pessoadao(){
		return new PessoaDao();
	}
	
	
	
	
	
	
}
