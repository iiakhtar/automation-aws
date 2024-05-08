package com.spe.qa.constant;

public interface UTILITY_CONSTANTS {

	final String TOTAL = "total";
	final String FAIL = "fail";
	final String PASS = "pass";
	final String SKIP = "skip";
	
	final String REPO = "repo_name";
	final String BRANCH= "branch_name";
	final String BROWSER= "browser";
	final String ENV= "environment";
	final String MODULES= "modules";
	final String COLDSTART = "coldstart";
	final String REFERENCE= "reference";
	final String TOOL = "tool";
	final String BASE_TASKDEF= "base_taskdef";
	final String ECR_IMAGE_TAG= "ecr_image_tag";
	final String FAILED= "failed";
	final String RUNNING= "running";
	final String STOPPED= "stopped";
	enum STATUS {
	    stopped, failed, running;
	}
}