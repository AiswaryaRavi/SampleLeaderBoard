package com.revature.biz;

import java.util.List;

import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.StudentAccount;
import com.revature.model.dto.StudentAccountDTO;

public interface StudentAccountService {

	/**
	 * Used to do login activities.
	 * 
	 * @throws BusinessServiceException
	 *             if any business error occurs
	 */
	public List<StudentAccount> Login(String emailId, String password) throws BusinessServiceException;

	StudentAccountDTO getUserByLogin(String emailId, String password) throws BusinessServiceException;

	String insertUserPassword(String password, String emailId) throws BusinessServiceException;

}
