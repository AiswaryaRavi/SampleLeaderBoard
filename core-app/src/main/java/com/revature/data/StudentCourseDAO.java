package com.revature.data;

import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.model.StudentCourse;


public interface StudentCourseDAO {

  /**
   * Used to get the student courses data from db.
   * 
   * @return student courses
   * @throws DataServiceException if any exception happens while executing the query
   */

  public List<StudentCourse> getAllStudentCourses() throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseSkillPoints() throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseSkillPointsById(Integer id) throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseActivityPoints() throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseActivityPointsById(Integer studentId) throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseHoursSpent(Integer studentId) throws DataServiceException;
  public List<StudentCourse> getAllStudentCoursePercentage(Integer studentId) throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseDetails(String courseName) throws DataServiceException;
  public List<StudentCourse> getAllStudentCourseActivityDetails(String courseName) throws DataServiceException;






}