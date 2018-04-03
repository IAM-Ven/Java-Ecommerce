package net.eyoel.javaecom_backend.dao.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.eyoel.javaecom_backend.dao.StoreCategoryDao;
import net.eyoel.javaecom_backend.dto.StoreCategory;

public class StoreCategoryDaoTest {

	private static AnnotationConfigApplicationContext context;
	private static StoreCategoryDao storeCategoryDao;
	private StoreCategory storeCategory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.eyoel.javaecom_backend");
		context.refresh();
		storeCategoryDao = (StoreCategoryDao) context.getBean("storeCategoryDao");
	}

	@Test
	public void addStoreCategoryTest() {
		storeCategory = new StoreCategory();
		storeCategory.setName("People");
		storeCategory.setInfo("This is a test case for people");
		storeCategory.setImage("people.png");

		assertEquals("Success! Added store category", true, storeCategoryDao.addStoreCategory(storeCategory));
	}

	@Test
	public void getStoreCategoryTest() {
		storeCategory = storeCategoryDao.getStoreCategoryId(1);
		assertEquals("Success! Got a category by id", "Men", storeCategory.getName());

	}

	@Test
	public void updateStoreCategoryTest() {
		storeCategory = storeCategoryDao.getStoreCategoryId(1);
		storeCategory.setName("Kids");
		assertEquals("Success! Updated to Kids", true, storeCategoryDao.updateStoreCategory(storeCategory));
	}

	@Test
	public void deleteStoreCategoryTest() {
		storeCategory = storeCategoryDao.getStoreCategoryId(1);
		assertEquals("Success! deleted a category", true, storeCategoryDao.deleteStoreCategory(storeCategory));

	}

	@Test
	public void getStoreCategoryList() {
		assertEquals("Success! Got number of active lists", 3, storeCategoryDao.getStoreCategoryList().size());

	}

	// Single test case
	@Test
	public void test() {
		// create
		storeCategory = new StoreCategory();
		storeCategory.setName("Alien");
		storeCategory.setInfo("This is a test case for Alien");
		storeCategory.setImage("alien.png");
		assertEquals("Success! Added store category", true, storeCategoryDao.addStoreCategory(storeCategory));
		// update
		storeCategory = storeCategoryDao.getStoreCategoryId(39);
		storeCategory.setName("Alien");
		assertEquals("Success! Updated to Alien", true, storeCategoryDao.updateStoreCategory(storeCategory));
		// delete
		assertEquals("Success! deleted a category", true, storeCategoryDao.deleteStoreCategory(storeCategory));
		// read
		assertEquals("Success! Got a category by id", "Alien", storeCategory.getName());

	}

}
