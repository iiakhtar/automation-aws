package com.spe.qa.bo;

import java.util.HashMap;

import com.spe.qa.constant.UTILITY_CONSTANTS;
import com.spe.qa.dao.TransactionHistory_DAO;
import com.spe.qa.entity.Payload_Entity;
import com.spe.qa.entity.Request_Entity;
import com.spe.qa.entity.TestCaseCount_Entity;
import com.spe.qa.entity.TransactionHistory_Entity;
/**
 * @author IAkhtar
 *
 */
public class TransactionHistory_BO {

	public TransactionHistory_Entity setTransactionHistory_Entity(Request_Entity re) {
		TransactionHistory_Entity te = new TransactionHistory_Entity();
		try {
			//te.setRequest_number(generateRequest_NO(re));
			te.setImage_id(re.getImage_id());
			te.setTask_id(re.getTask_id());
			te.setTask_definition(re.getTask_definition());
			te.setStart_timestamp(re.getStart_timestamp());
			te.setEnd_timestamp(re.getEnd_timestamp());
			te.setTask_status(re.getTask_status());
			te.setReference(re.getReference());
			te.setTestcase(getTestCaseData(re));
		    te.setPayload_data(getPayloaddata(re));
		    te.setBrowser(re.getBrowser());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return te;
	}
	
	public HashMap<String, Integer> getTestCaseData(Request_Entity re) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		TestCaseCount_Entity te = re.getTest_case();
		try {
			
			hm.put(UTILITY_CONSTANTS.TOTAL, te.getTotal_testcases());
			hm.put(UTILITY_CONSTANTS.PASS, te.getPassed_testcases());
			hm.put(UTILITY_CONSTANTS.FAIL,te.getFailed_testcases());
			hm.put(UTILITY_CONSTANTS.SKIP,te.getSkipped_testcases());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return hm;
	}
	
	
	public HashMap<String, String> getPayloaddata(Request_Entity re) {
		HashMap<String, String> hm = new HashMap<String, String>();
		try {
			Payload_Entity pe = re.getPayload_data();
			hm.put(UTILITY_CONSTANTS.REPO, pe.getRepo_name());
			hm.put(UTILITY_CONSTANTS.BRANCH, pe.getBranch_name());
			hm.put(UTILITY_CONSTANTS.BROWSER, pe.getBrowser());
			hm.put(UTILITY_CONSTANTS.ENV, pe.getEnvironment());
			hm.put(UTILITY_CONSTANTS.MODULES, pe.getModules().toString());
			hm.put(UTILITY_CONSTANTS.COLDSTART, pe.getColdstart().toString());
			hm.put(UTILITY_CONSTANTS.REFERENCE, pe.getReference());
			hm.put(UTILITY_CONSTANTS.TOOL, pe.getTool());
			hm.put(UTILITY_CONSTANTS.BASE_TASKDEF, pe.getBase_taskdef());
			hm.put(UTILITY_CONSTANTS.ECR_IMAGE_TAG, pe.getEcr_image_tag());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return hm;
	}
	
	public void  insertRecord(TransactionHistory_Entity te) {
		try {
			System.out.println("Inside TransactionHistory_BO : insertRecord");
			TransactionHistory_DAO tdao = new TransactionHistory_DAO();
			tdao.saveRecord(te);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
