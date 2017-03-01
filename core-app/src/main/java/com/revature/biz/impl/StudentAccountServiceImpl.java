package com.revature.biz.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.biz.StudentAccountService;
import com.revature.biz.exception.BusinessServiceException;

import com.revature.data.StudentAccountDAO;
import com.revature.data.exception.DataServiceException;
import com.revature.model.Category;
import com.revature.model.StudentAccount;



@Service

public class StudentAccountServiceImpl implements StudentAccountService {
	private static Logger logger = Logger.getLogger(CategoryServiceImpl.class);

	@Autowired
	private StudentAccountDAO studentaccountDAO;

	@Override
	public List<StudentAccount> Login(String emailId, String password) throws BusinessServiceException {
		 List<StudentAccount> studentAccount = null;
		try {
			studentAccount=studentaccountDAO.getId(emailId, password);
			logger.info("Categories retrieved successfully");
		} catch (DataServiceException e) {
			logger.error(e.getMessage(), e);
			throw new BusinessServiceException(e.getMessage(), e);
		}
		return studentAccount;

	}

}