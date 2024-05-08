package com.spe.qa.dao;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.spe.qa.entity.TaskStatus_Entity;

public class TaskStatus_DAO {
	AmazonDynamoDB dynamoDBClient;
	DynamoDBMapper mapper;
	private Regions REGION = Regions.US_WEST_2;
	
	
	public TaskStatus_DAO() {

		dynamoDBClient = AmazonDynamoDBClientBuilder.standard().withRegion(REGION).build();

		mapper = new DynamoDBMapper(dynamoDBClient);
	}
	
	public void  saveRecord(TaskStatus_Entity taskstatus) {
		try {
			 System.out.println("Inside TaskStatus_DAO : saveRecord");
			 mapper.save(taskstatus);
		     System.out.println("Record is updated in the table!");
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Record is not update in the table");
		}
	   
	}
	
}
