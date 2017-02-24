package com.revature.biz.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.biz.CategoryService;
import com.revature.biz.exception.BusinessServiceException;
import com.revature.data.CategoryDAO;
import com.revature.data.exception.DataServiceException;
import com.revature.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

  private CategoryDAO categoryDAO;

  @Override
  public List<Category> getAllCategories() throws BusinessServiceException {
    List<Category> categories = null;
    try {
      categories = categoryDAO.getAllCategories();
    } catch (DataServiceException e) {
      throw new BusinessServiceException(e.getMessage(), e);
    }
    return categories;
  }

}
