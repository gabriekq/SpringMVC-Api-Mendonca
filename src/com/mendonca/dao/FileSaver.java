package com.mendonca.dao;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class FileSaver {

	@Autowired
	private HttpServletRequest request;
	
	private String  path = "D:\\Programacao\\data\\pics\\";
	
	
	
	public String write(MultipartFile file){
		
		//String realPath = request.getServletContext().getRealPath("/"+baseFolder);
	
		
		try{
			
		//String path = realPath+"/"+file.getOriginalFilename();
		
		
		file.transferTo(new File(path + file.getOriginalFilename() ));
		return  path;
			
		}catch(IOException exception) {
			throw new RuntimeException(exception);
		}
		
		
		
	}
	
	
	
}
