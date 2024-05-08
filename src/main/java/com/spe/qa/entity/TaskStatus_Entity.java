package com.spe.qa.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.spe.qa.constant.UTILITY_CONSTANTS;

/**
 * @author IAkhtar
 *
 */
@DynamoDBTable(tableName = "task_status")
public class TaskStatus_Entity implements UTILITY_CONSTANTS {

	String image_id;
	String task_id;
	String status;
	String browser;
	
	@DynamoDBHashKey(attributeName = "image_id")
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	@DynamoDBAttribute
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	@DynamoDBAttribute
	public String getStatus() {
		return status;
	}
	public void setStatus(STATUS s) {
		switch (s) {
			case failed: 
				this.status= FAILED;
				break;
			case stopped:
				this.status= STOPPED;
				break;
			case running:
				this.status= RUNNING;
				break;
		}

	}
	@DynamoDBAttribute
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	
	
	
}
