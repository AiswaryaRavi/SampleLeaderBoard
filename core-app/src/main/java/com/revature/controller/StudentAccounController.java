package com.revature.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.biz.CategoryService;
import com.revature.biz.StudentAccountService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.controller.exception.InternalException;
import com.revature.controller.exception.InvalidInputException;
import com.revature.model.Category;
import com.revature.model.StudentAccount;
import com.revature.model.dto.StudentAccountDTO;

@RestController
// @RequestMapping("/")

public class StudentAccounController {
	private static Logger logger = Logger.getLogger(StudentAccounController.class);

	@Autowired
	private StudentAccountService studentAccountService;

//	@RequestMapping("/login")
//	public List<StudentAccount> getActiveStudentAccountController(@RequestParam("emailId") String emailId,
//			@RequestParam("password") String password) {
//		List<StudentAccount> studentAccount = null;
//
//		try {
//			logger.info("Getting the login data...");
//			studentAccount = studentAccountService.Login(emailId, password);
//
//			logger.info("login data retrieval success1.");
//		} catch (BusinessServiceException e) {
//			logger.error(e.getMessage(), e);
//			throw new InvalidInputException(e.getMessage(), e);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new InternalException("System has some issue...", e);
//		}
//		return studentAccount;
//	}

	@GetMapping("/login1/{emailId}/{password}")
	public StudentAccountDTO loginController(@PathVariable("emailId") String emailId,
			@PathVariable("password") String password) {
		StudentAccountDTO studentAccountDTO = new StudentAccountDTO();
		
		try {
			logger.info("Getting the Users data...");
			studentAccountDTO = studentAccountService.getUserByLogin(emailId,password);
			logger.info("Users data retrieval success.");
		} catch (BusinessServiceException e) {
			logger.error(e.getMessage(), e);
			throw new InvalidInputException(e.getMessage(), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new InternalException("System has some issue...", e);
		}
		return studentAccountDTO;
	}
	
	@GetMapping("emailId/{emailId}/password/{password}")
	public String passwordInsertController(@PathVariable("password") String password,@PathVariable("emailId") String emailId) {
		String studentAccount = null;
		
		try {
			logger.info("encrypting...");
			studentAccount = studentAccountService.insertUserPassword(password,emailId);
			logger.info("Password inserted.");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new InternalException("System has some issue...", e);
		}
		return studentAccount;
}

}
