package com.spe.qa.bo;

import com.spe.qa.dao.TaskStatus_DAO;
import com.spe.qa.entity.TaskStatus_Entity;

/**
 * @author IAkhtar
 *
 */
public class TaskStatus_BO {

	public void update_taskstatus(TaskStatus_Entity taskstatus) {
		try {
			TaskStatus_DAO dao = new TaskStatus_DAO();
			dao.saveRecord( taskstatus);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
}
