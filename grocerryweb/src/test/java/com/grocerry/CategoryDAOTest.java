package com.grocerry;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.grocerry.dao.CategoryDao;
import com.grocerry.model.Category;

public class CategoryDAOTest
{
	static CategoryDao categorydao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.grocerry");
		context.refresh();
		categorydao=(CategoryDao) context.getBean("categoryDAO");
		
		
	}
 /*  public static void main(String args[])
   {
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	   context.scan("com.grocerry");
	   context.refresh();
	   CategoryDao categorydao=(CategoryDao) context.getBean("CategoryDAO");
	   Category category=new Category();
	   
	   category.setCategoryname("Nuts");
	   category.setCategoryDesc("All varieties of Nuts are Available");
	   categorydao.addCategory(category);
	   
	   System.out.println("Category Added Successfully");
   }
	*/

		
	
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryname("Nuts");
		category.setCategoryDesc("All Nuts are here");
		assertTrue("Problem is adding Category",categorydao.addCategory(category));
	}

	@Test
	public void updateCategoryTest()
	{
		Category category=categorydao.getCategory(1);
		category.setCategoryDesc("All Rice Varieties are Available here");
		assertTrue("Problem in updating Category",categorydao.updateCategory(category));
	}
	
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categorydao.getCategory(1);
		assertTrue("Problem in deleting category",categorydao.deleteCategory(category));
	}
	public void listCategoriesTest()
	{
		List<Category> listcategories=categorydao.listCategories();
		assertNotNull("Problem in listing",listcategories);
		for(Category category:listcategories)
		{
			System.out.println(category.getId());
			System.out.println(category.getCategoryname());
			System.out.println(category.getCategoryDesc());
			
		}
	}
}

