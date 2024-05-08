package com.spe.qa.entity;

import com.spe.qa.constant.UTILITY_CONSTANTS;
/**
 * @author IAkhtar
 *
 */
public class Request_Entity implements UTILITY_CONSTANTS{
	String task_id;
	String image_id;
	String task_definition;
	String start_timestamp;
	String end_timestamp;
	String task_status;
	String reference;
	String browser;
	TestCaseCount_Entity test_case;
	Payload_Entity payload_data;
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public String getTask_definition() {
		return task_definition;
	}
	public void setTask_definition(String task_definition) {
		this.task_definition = task_definition;
	}
	public String getStart_timestamp() {
		return start_timestamp;
	}
	public void setStart_timestamp(String start_timestamp) {
		this.start_timestamp = start_timestamp;
	}
	public String getEnd_timestamp() {
		return end_timestamp;
	}
	public void setEnd_timestamp(String end_timestamp) {
		this.end_timestamp = end_timestamp;
	}
	public String getTask_status() {
		return task_status;
	}
	public void setTask_status(STATUS s) {
		switch (s) {
			case failed: 
				this.task_status= FAILED;
				break;
			case stopped:
				this.task_status= STOPPED;
				break;
			case running:
				this.task_status= RUNNING;
				break;
		}

	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public TestCaseCount_Entity getTest_case() {
		return test_case;
	}
	public void setTest_case(TestCaseCount_Entity test_case) {
		this.test_case = test_case;
	}
	public Payload_Entity getPayload_data() {
		return payload_data;
	}
	public void setPayload_data(Payload_Entity payload_data) {
		this.payload_data = payload_data;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
}
