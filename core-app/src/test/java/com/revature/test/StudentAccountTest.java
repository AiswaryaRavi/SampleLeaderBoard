package com.revature.test;

import com.revature.data.exception.DataServiceException;
import com.revature.data.impl.StudentAccountDAOImpl;

public class StudentAccountTest {
	public static void main(String[] args) throws DataServiceException {
		StudentAccountDAOImpl s=new StudentAccountDAOImpl();
		System.out.println(s.getId("aiswaryaravindarn240@gmail.com","ais0805"));
	}
	
}