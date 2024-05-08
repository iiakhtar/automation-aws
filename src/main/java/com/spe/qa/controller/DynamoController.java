package com.spe.qa.controller;

import com.spe.qa.bo.TaskStatus_BO;
import com.spe.qa.bo.TransactionHistory_BO;
import com.spe.qa.constant.UTILITY_CONSTANTS;
import com.spe.qa.entity.Request_Entity;
import com.spe.qa.entity.TaskStatus_Entity;
import com.spe.qa.entity.TransactionHistory_Entity;

/**
 * @author IAkhtar
 *
 */
public class DynamoController implements UTILITY_CONSTANTS{
	public void persistRecord(Request_Entity re) {
		try {
			//start : remove
			/*List ls = new ArrayList();
			ls.add("About"); ls.add("Home");
			Request_Entity re = new Request_Entity();
			TestCaseCount_Entity test = new TestCaseCount_Entity();
			test.setFailed_testcases(1);test.setPassed_testcases(91);test.setTotal_testcases(92);
			Payload_Entity pe = new Payload_Entity();
			pe.setModules(ls);pe.setColdstart(22);
			re.setPayload_data(pe);
			re.setImage_id("app1");
			re.setStart_timestamp("2021:08:09");
			re.setTest_case(test);
			re.setEnd_timestamp("2024:08:09");
			re.setTask_id("taskid1");
			*/
			//end: remove
			System.out.println("inside persistrecord= "+re);
			
			TransactionHistory_BO t_bo = new TransactionHistory_BO();
			TransactionHistory_Entity t_ent =t_bo.setTransactionHistory_Entity(re);
			t_bo.insertRecord(t_ent);
			
			System.out.println("Ending="+t_ent);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void update_task_status(TaskStatus_Entity taskstatus) {
		try {
			
			TaskStatus_BO taskbo = new TaskStatus_BO();
			taskbo.update_taskstatus(taskstatus);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
