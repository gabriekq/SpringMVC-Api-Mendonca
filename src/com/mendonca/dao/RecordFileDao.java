package com.mendonca.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mendonca.model.RecordFile;


@Repository
public class RecordFileDao {

@PersistenceContext
private EntityManager manager;


public void saveRecord(RecordFile recordFile){
	manager.persist(recordFile);
}
	

public RecordFile getRecordFile( String FileName){
	
	return manager.find(RecordFile.class, FileName);
}

	
	
}
