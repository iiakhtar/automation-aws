package com.spe.qa.entity;

public class TestCaseCount_Entity {
	int total_testcases;
	int passed_testcases;
	int failed_testcases;
	int skipped_testcases;

	public int getSkipped_testcases() {
		return skipped_testcases;
	}

	public void setSkipped_testcases(int skipped_testcases) {
		this.skipped_testcases = skipped_testcases;
	}

	public int getTotal_testcases() {
		return total_testcases;
	}

	public void setTotal_testcases(int total_testcases) {
		this.total_testcases = total_testcases;
	}

	public int getPassed_testcases() {
		return passed_testcases;
	}

	public void setPassed_testcases(int passed_testcases) {
		this.passed_testcases = passed_testcases;
	}

	public int getFailed_testcases() {
		return failed_testcases;
	}

	public void setFailed_testcases(int failed_testcases) {
		this.failed_testcases = failed_testcases;
	}
}
