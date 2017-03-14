package com.revature.data;

import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentAccount;
import com.revature.model.dto.StudentAccountDTO;

public interface StudentAccountDAO {

	/**
	 * Used to get the login data from db.
	 * 
	 * @return login
	 * @throws DataServiceException
	 *             if any exception happens while executing the query
	 */

	public List<StudentAccount> getId(String emailId, String password) throws DataServiceException;

	public StudentAccountDTO getUserByLogin(String emailId, String password) throws DataServiceException;

	public String insertUserPassword(String password, String emailId) throws DataServiceException;

}
