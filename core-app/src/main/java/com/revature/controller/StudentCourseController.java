package com.revature.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.biz.StudentAccountService;
import com.revature.biz.StudentCourseService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.controller.exception.InternalException;
import com.revature.controller.exception.InvalidInputException;
import com.revature.model.StudentAccount;
import com.revature.model.StudentCourse;

@RestController
//@RequestMapping("/")

public class StudentCourseController {
	private static Logger logger = Logger.getLogger(StudentCourseController.class);

	  @Autowired
	  private StudentCourseService studentCourseService;
	  @Autowired
	  private StudentAccountService studentAccountService;

	  @RequestMapping("/studentcourses")
	  public List<StudentCourse> getActiveStudentCourseController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourses();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/studentcoursesskillpoints")
	  public List<StudentCourse> getActiveStudentCourseSkillPointsController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseSkillPoints();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/studentcoursesskillpointsbyId/{studentId}")
	  public List<StudentCourse> getActiveStudentCourseSkillPointsControllerbyId(@PathVariable("studentId") Integer studentId) {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseSkillPointsById(studentId);
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/studentcoursesactivitypoints")
	  public List<StudentCourse> getActiveStudentCourseAtivityPointsController() {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseActivityPoints();
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/studentcoursesactivitypoints/{studentId}")
	  public List<StudentCourse> getActiveStudentCourseAtivityPointsControllerbyId(@PathVariable("studentId") Integer studentId) {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseActivityPointsById(studentId);
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
//	  @RequestMapping("/studentcourseshoursspent/{emailId}/{password}")
//	  public List<StudentCourse> getActiveStudentCourseHoursSpentController(@PathVariable("emailId") String emailId,@PathVariable("password") String password) {
//	    List<StudentCourse> studentcourses = null;
//	    List<StudentAccount> studentaccount = null;
//	    try {
//	    	studentaccount=studentAccountService.Login(emailId,password);
//	    	StudentAccount s=studentaccount.get(0);
//	      logger.info("Getting the student courses data...");
//	      studentcourses = studentCourseService.getAllStudentCourseHoursSpent(s.getId());
//	      logger.info("student courses data retrieval success.");
//	    } catch (BusinessServiceException e) {
//	      logger.error(e.getMessage(), e);
//	      throw new InvalidInputException(e.getMessage(), e);
//	    } catch (Exception e) {
//	      logger.error(e.getMessage(), e);
//	      throw new InternalException("System has some issue...", e);
//	    }
//	    return studentcourses;
//	  }
	  @RequestMapping("/studentcourseshoursspent/{studentId}")
	  public List<StudentCourse> getActiveStudentCourseHoursSpentController(@PathVariable("studentId") Integer studentId) {
	    List<StudentCourse> studentcourses = null;
	    
	    try {

	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseHoursSpent(studentId);
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/studentcoursespercentage/{studentId}")
	  public List<StudentCourse> getActiveStudentPercentageController(@PathVariable("studentId") Integer studentId) {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCoursePercentage(studentId);
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }
	  @RequestMapping("/studentcoursedetails/{studentId}/{courseName}")
	  public List<StudentCourse> getActiveStudentCourseDetailsController(@PathVariable("studentId") Integer studentId,@PathVariable("courseName") String courseName) {
	    List<StudentCourse> studentcourses = null;
	    try {
	      logger.info("Getting the student courses data...");
	      studentcourses = studentCourseService.getAllStudentCourseDetails(studentId,courseName);
	      logger.info("student courses data retrieval success.");
	    } catch (BusinessServiceException e) {
	      logger.error(e.getMessage(), e);
	      throw new InvalidInputException(e.getMessage(), e);
	    } catch (Exception e) {
	      logger.error(e.getMessage(), e);
	      throw new InternalException("System has some issue...", e);
	    }
	    return studentcourses;
	  }


}
