package com.mendonca.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mendonca.conf.AppWebConfiguration;
import com.mendonca.conf.JPAConfiguration;
import com.mendonca.dao.PessoaDao;
import com.mendonca.model.Pessoa;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DaoConfTest.class,JPAConfiguration.class})
public class DaoTest {

private PessoaDao daoTest;

@Autowired
public void setDaoTest(PessoaDao daoTest){
	this.daoTest = daoTest;
}


@Test
public void testGetPessoa(){
Pessoa pessoa = daoTest.getPessoas().get(0);
Assert.assertEquals(pessoa.getNome(),"mendonca" );
	
}


	
	
}
