package com.revature.test;

import java.util.Iterator;
import java.util.List;

import com.revature.data.exception.DataServiceException;
import com.revature.data.impl.CategoryDAOImpl;
import com.revature.model.Category;

public class CategoryTest {

	public static void main(String[] args) throws DataServiceException {
		CategoryDAOImpl c=new CategoryDAOImpl();
//		 List<Category> list = c.getAllCategories();
//		 Iterator<Category> i = list.iterator();
//		 while (i.hasNext()) {
//		 Category tt1 = (Category) i.next();
//		 System.out.println(tt1.getId());
//		 }
System.out.println(c.getAllCategories());

	}

}
