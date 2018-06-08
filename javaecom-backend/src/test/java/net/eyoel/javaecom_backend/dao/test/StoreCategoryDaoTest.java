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
		storeCategory.setName("123");


		assertEquals("Failed! ", true, storeCategoryDao.addStoreCategory(storeCategory));
	}

	@Test
	public void getStoreCategoryTest() {
		storeCategory = storeCategoryDao.getStoreCategoryId(1);
		assertEquals("Failed! ", "Kids", storeCategory.getName());

	}

	@Test
	public void updateStoreCategoryTest() {
		storeCategory = storeCategoryDao.getStoreCategoryId(4);
		storeCategory.setName("Blabla");
		assertEquals("Failed! ", true, storeCategoryDao.updateStoreCategory(storeCategory));
	}

	@Test
	public void deleteStoreCategoryTest() {
		storeCategory = storeCategoryDao.getStoreCategoryId(4);
		assertEquals("Failed! ", true, storeCategoryDao.deleteStoreCategory(storeCategory));

	}

	@Test
	public void getStoreCategoryList() {
		assertEquals("Failed! ", 3, storeCategoryDao.getStoreCategoryList().size());

	}

	// Single test case
	@Test
	public void test() {
		// create
		storeCategory = new StoreCategory();
		storeCategory.setName("Car");

		assertEquals("Failed! can't add", true, storeCategoryDao.addStoreCategory(storeCategory));
		// update
		storeCategory = storeCategoryDao.getStoreCategoryId(4);
		storeCategory.setName("Truck");
		assertEquals("Failed", true, storeCategoryDao.updateStoreCategory(storeCategory));
		// delete
		assertEquals("Failed", true, storeCategoryDao.deleteStoreCategory(storeCategory));
		// read
		assertEquals("Failed", "Truck", storeCategory.getName());

	}

}
