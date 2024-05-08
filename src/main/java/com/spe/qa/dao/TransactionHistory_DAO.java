package com.spe.qa.dao;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.spe.qa.entity.TransactionHistory_Entity;

public class TransactionHistory_DAO {
	AmazonDynamoDB dynamoDBClient;
	DynamoDBMapper mapper;
	private Regions REGION = Regions.US_WEST_2;
	
	
	public TransactionHistory_DAO() {

		dynamoDBClient = AmazonDynamoDBClientBuilder.standard().withRegion(REGION).build();

		mapper = new DynamoDBMapper(dynamoDBClient);
	}
	
	public void  saveRecord(TransactionHistory_Entity te) {
		try {
			 System.out.println("Inside TransactionHistory_DAO : saveRecord");
			 mapper.save(te);
		     System.out.println("Record is inserted into table!");
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Record is not inserted into table");
		}
	   
	}
	
}
