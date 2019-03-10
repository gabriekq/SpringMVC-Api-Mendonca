package com.mendonca.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mendonca.dao.ExecutCommand;
import com.mendonca.dao.FileReaderText;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ExecutCommand.class})
public class IoTest {

@Test
public void TestIo(){
	
	FileReaderText fileReader = new FileReaderText();
	

		try {
			fileReader.readFile("D:\\Programacao\\data\\text-pic\\curriculo2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	
	StringBuffer str = fileReader.getText();
	System.out.println(str);
	
	//fileReader.getText().stream().forEach(System.out::println);
	
	
	
}	
	
	
	
	
	
	
	
	
}
