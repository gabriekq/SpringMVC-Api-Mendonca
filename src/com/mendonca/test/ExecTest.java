package com.mendonca.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mendonca.dao.ExecutCommand;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ExecutCommand.class})
public class ExecTest {

	private ExecutCommand objComma ;
	 int exepect ;
	
	 @Autowired
	 public void setobjComma(ExecutCommand objComma){
		 this.objComma = objComma;
	 }
	 
	 
	@Test
	public void testCommand(){
				
		objComma.runCommand("D:\\Programacao\\JavaEE-WorkSpace\\Projeto-SpringMVC\\Resources\\command_line.bat");
		exepect = objComma.getExitValue();
		Assert.assertEquals(0, exepect );
	}
	
	
	
	
}
