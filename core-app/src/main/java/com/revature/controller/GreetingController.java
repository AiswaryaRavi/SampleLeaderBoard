package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.biz.CategoryService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.model.Category;

@RestController
@RequestMapping("/")
public class GreetingController {

  @Autowired
  private CategoryService categoryService;

  @RequestMapping("/categories")
  public List<Category> greeting() {
    List<Category> categories = null;
    try {
      categories = categoryService.getAllCategories();
    } catch (BusinessServiceException e) {
      // set the business service error
    } catch (Exception e) {
      // set the internal server error
    }
    return categories;
  }
}
