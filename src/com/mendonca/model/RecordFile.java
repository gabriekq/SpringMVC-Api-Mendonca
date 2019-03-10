package com.mendonca.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecordFile {

@Id	
private String FileName;	
private String FilePath;




public String getFileName() {
	return FileName;
}

public void setFileName(String fileName) {
	FileName = fileName;
}

public String getFilePath() {
	return FilePath;
}

public void setFilePath(String filePath) {
	FilePath = filePath;
}






	
	
	
	
	
	
	
}
