package net.eyoel.javaecom_backend.dao.test;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.eyoel.javaecom_backend.dao.StoreProductDao;
import net.eyoel.javaecom_backend.dto.StoreProduct;

public class StoreProductDaoTest {

	private static AnnotationConfigApplicationContext context;
	private StoreProduct product;
	private static StoreProductDao storeproductDao;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.eyoel.javaecom_backend");
		context.refresh();
		storeproductDao = (StoreProductDao) context.getBean("storeproductDao");

	}

	@Test
	public static void getStoreProduct() {

	}

	@Test
	public static void updateProduct() {

	}

	@Test
	public static void deleteProduct() {

	}

	@Test
	public static void addProductTest() {

	}

	@Test
	public static void getListOfAllProducts() {

	}

	@Test
	public static void getListOfAllActiveProductsByCategory() {

	}

	@Test
	public static void getListOfRecentActiveProducts() {

	}

	@Test
	public static void getListOfPopularActiveProducts() {

	}

	@Test
	public static void getListOfSummerActiveProducts() {

	}

	@Test
	public static void getListOfWinterActiveProducts() {

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
