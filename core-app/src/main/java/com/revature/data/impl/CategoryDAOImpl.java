package com.revature.data.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.data.CategoryDAO;
import com.revature.data.exception.DataServiceException;
import com.revature.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

  @Override
  public List<Category> getAllCategories() throws DataServiceException {
    List<Category> categories = null;
    try {
      // get the data from db.
      categories = null;
    } catch (Exception e) {
      throw new DataServiceException(e.getMessage(), e);
    }
    return categories;
  }

}
