package com.mendonca.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.Part;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mendonca.dao.ExecutCommand;
import com.mendonca.dao.FileReaderText;
import com.mendonca.dao.FileSaver;
import com.mendonca.dao.RecordFileDao;
import com.mendonca.model.RecordFile;




@Controller
@Transactional
//@Scope(value=WebApplicationContext.SCOPE_APPLICATION)
public class HomeController {

	private String filepath = "D:\\Programacao\\data\\text-pic\\";
    private String fileName;
	
	
	@Autowired
	private RecordFileDao recordDao;
	
	@Autowired
	private FileSaver fileSaver;
	
	@Autowired
	private ExecutCommand  executCommand; 
	
	@Autowired
	private FileReaderText fileReaderText;
	
	
	@RequestMapping(method = RequestMethod.GET , value ="sendpic")
	public String loadPicPage(){	
		//HTML file
		return "sendPic" ;
	}
	
	
	@RequestMapping(method = RequestMethod.POST , value  = "savefile")
	public String  saveFile(MultipartFile summary){
	
	String fileName;	
		
	System.out.println(summary.getName()+";"+summary.getOriginalFilename());
	String FullPath = fileSaver.write(summary);
	
	
    RecordFile recordFile = new RecordFile();
	recordFile.setFileName(summary.getOriginalFilename());
	recordFile.setFilePath(FullPath);
 	recordDao.saveRecord(recordFile);
	
	//"cmd.exe /c start D:\\Programacao\\Python\\PyCharm-Projetos\\Text-pic-Mendonca\\venv\\Scripts\\python.exe D:\\Programacao\\Python\\PyCharm-Projetos\\Text-pic-Mendonca\\app.py"
     executCommand.runCommand("D:\\Programacao\\JavaEE-WorkSpace\\Projeto-SpringMVC\\Resources\\command_line.bat");
    
     fileName = "";
     fileName = summary.getOriginalFilename().split("([.])+")[0]+".txt";
     
     setFileName(fileName);
     
	return  "redirect:listtext";	
		// this method receves the file
	} 
	
	
	@RequestMapping(method=RequestMethod.GET,value="listtext")
	public ModelAndView Display(){
		
		ModelAndView modelAndView = new ModelAndView("showtext");
		
		System.out.println("Dentro do metodo");
		
	//	FileReaderText fileReaderText = new FileReaderText();
		
		System.out.println(filepath+getFileName());
		
		if(fileReaderText.existFile(filepath+getFileName())==false){
			
			try {
				Thread.sleep(Long.parseLong("1000"));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			return Display();
		}
		
		
		try {
			fileReaderText.readFile(filepath+getFileName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Verificar"+filepath+getFileName());
		
		System.out.println(fileReaderText.getText());
		modelAndView.addObject("text",fileReaderText.getText());
		
		return modelAndView;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
   
	
	
	
	
	
	
	
	
}
