package com.mendonca.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;


@Component
public class FileReaderText {

   private StringBuffer fileText ;	
   
	public FileReaderText() {
	    super();
		
	}


	public void readFile(String pathFile) throws IOException, FileNotFoundException{	
		
		fileText = new StringBuffer();
		File file = new File(pathFile);
		BufferedReader bufferReader = new BufferedReader(new FileReader(file));
		String text;
		
		while( (text = bufferReader.readLine()) != null ){	
			fileText.append(text+"\n");
		}
			  
	}
	
	
	public StringBuffer getText(){
		return fileText;
	}
	
	
	public boolean existFile(String pathFile){
		File file = new File(pathFile);
	    return 	file.exists();	
	}
	
	
	
	
	
}
