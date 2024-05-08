package com.spe.qa.entity;

import java.util.HashMap;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "transaction_history")
public class TransactionHistory_Entity {
	
	
	//Integer request_number;
	String task_id;
	String image_id;
	String task_definition;
	String start_timestamp;
	String end_timestamp;
	String task_status;
	List<String> modules;
	String reference;
	HashMap<String, Integer> testcase;
	HashMap<String,String> payload_data;
	String browser;
	 
	@DynamoDBHashKey(attributeName = "task_id")
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	 @DynamoDBAttribute
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	 @DynamoDBAttribute
	public String getTask_definition() {
		return task_definition;
	}
	public void setTask_definition(String task_definition) {
		this.task_definition = task_definition;
	}
	@DynamoDBIndexHashKey(globalSecondaryIndexName="start_timestamp")
	public String getStart_timestamp() {
		return start_timestamp;
	}
	public void setStart_timestamp(String start_timestamp) {
		this.start_timestamp = start_timestamp;
	}
	@DynamoDBIndexHashKey(globalSecondaryIndexName="end_timestamp")
	public String getEnd_timestamp() {
		return end_timestamp;
	}
	public void setEnd_timestamp(String end_timestamp) {
		this.end_timestamp = end_timestamp;
	}
	 @DynamoDBAttribute
	public String getTask_status() {
		return task_status;
	}
	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}
	 @DynamoDBAttribute
	public List<String> getModules() {
		return modules;
	}
	public void setModules(List<String> modules) {
		this.modules = modules;
	}
	 @DynamoDBAttribute
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	 @DynamoDBAttribute
	public HashMap<String, Integer> getTestcase() {
		return testcase;
	}
	public void setTestcase(HashMap<String, Integer> testcase) {
		this.testcase = testcase;
	}
	public HashMap<String, String> getPayload_data() {
		return payload_data;
	}
	public void setPayload_data(HashMap<String, String> payload_data) {
		this.payload_data = payload_data;
	}
	@DynamoDBAttribute
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	
}
