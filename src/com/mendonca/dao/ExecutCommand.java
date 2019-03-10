package com.mendonca.dao;

import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class ExecutCommand {

	private Process command;
	
	
	public void runCommand(String commandRun){
		
		try {
		command	 = Runtime.getRuntime().exec(commandRun);
	     
		
		if(command.waitFor() == 0){
			System.out.println("Running...");	
		}else{
			System.out.println("Erro");
		}	
					
		}catch(IOException e){
			e.printStackTrace();
		}catch(InterruptedException e){
			e.printStackTrace(); 
		}
		
	}
	
	
	public int getExitValue(){
		   
	return command.exitValue();
		
	}
	
	

	
	
	
	
}
