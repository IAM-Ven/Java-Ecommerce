package net.eyoel.javaecom_backend.dao.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.eyoel.javaecom_backend.dao.StoreProductDao;
import net.eyoel.javaecom_backend.dto.StoreProduct;

public class StoreProductDaoTest {

	private static AnnotationConfigApplicationContext context;
	private static StoreProduct product;
	private static StoreProductDao storeProductDao;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.eyoel.javaecom_backend");
		context.refresh();
		storeProductDao = (StoreProductDao) context.getBean("productDao");

	}

	@Test
	public void getStoreProduct() {
		product = storeProductDao.getStoreProduct(2);
		assertEquals("Failed! ", "Red Dress", product.getName());
	}

	@Test
	public void updateProduct() {
		product = storeProductDao.getStoreProduct(1);
		product.setBrand("YYY");
		assertEquals("Failed! ", true, storeProductDao.updateProduct(product));
	}

	@Test
	public void deleteProduct() {
		product = storeProductDao.getStoreProduct(5);
		assertEquals("Failed! ", true, storeProductDao.deleteProduct(product));
	}

	@Test
	public void addProductTest() {
		product = new StoreProduct();
		product.setActive(true);
		product.setBrand("Khole");
		product.setCategory_id(1);
		product.setInfo("The bets of our product right now");
		product.setName("Lime of nature");
		product.setPrice(23.90);
		product.setPurchases(33);
		product.setQuantity(100);
		product.setSummer(false);
		product.setUser_id(1);
		product.setViews(1200);
		product.setWinter(false);

		assertEquals("Failed! ", true, storeProductDao.addProduct(product));
	}

	@Test
	public void getListOfAllProducts() {
		assertEquals("Failled! ", 8, storeProductDao.getListOfAllProducts().size());
	}

	@Test
	public void getListOfAllActiveProductsByCategory() {
		assertEquals("Failed! ", 5, storeProductDao.getListOfAllActiveProductsByCategory(1).size());
	}

	@Test
	public void getListOfRecentActiveProducts() {
		assertEquals("Failed! ", 3, storeProductDao.getListOfRecentActiveProducts(3).size());
	}

	@Test
	public void getListOfPopularActiveProducts() {
		assertEquals("Failed! ", 3, storeProductDao.getListOfPopularActiveProducts(3).size());

	}

	@Test
	public void getListOfSummerActiveProducts() {
		assertEquals("Failed! ", 0, storeProductDao.getListOfSummerActiveProducts(4, true).size());
	}

	@Test
	public void getListOfWinterActiveProducts() {
		assertEquals("Failed! ", 0, storeProductDao.getListOfWinterActiveProducts(3, true).size());
	}

	// Single test case
	@Test
	public void test() {
		product = new StoreProduct();
		product.setActive(true);
		product.setBrand("Single brand");
		product.setCategory_id(1);
		product.setInfo("Single test info");
		product.setName("Single Test");
		product.setPrice(2.90);
		product.setPurchases(3);
		product.setQuantity(10);
		product.setSummer(false);
		product.setUser_id(2);
		product.setViews(901);
		product.setWinter(false);

		// add a sample product
		assertEquals("Failed! ", true, storeProductDao.addProduct(product));

		product = storeProductDao.getStoreProduct(20);

		// get the product by name
		assertEquals("Failed! ", "Single Test", product.getName());
		// update the product
		product.setName("Single Updated");
		assertEquals("Failed! ", true, storeProductDao.updateProduct(product));
		// delete the product
		assertEquals("Failed! ", true, storeProductDao.deleteProduct(product));
		// get list of all products
		assertEquals("Failled! ", 16, storeProductDao.getListOfAllProducts().size());
		// get list of all active prdocuts by their category
		assertEquals("Failed! ", 7, storeProductDao.getListOfAllActiveProductsByCategory(1).size());
		// get list of reacent active products
		assertEquals("Failed! ", 3, storeProductDao.getListOfRecentActiveProducts(3).size());
		// get list of popular active products
		assertEquals("Failed! ", 3, storeProductDao.getListOfPopularActiveProducts(3).size());
		// get list of summer active products
		assertEquals("Failed! ", 1, storeProductDao.getListOfSummerActiveProducts(4, true).size());
		// get list of winter active products
		assertEquals("Failed! ", 0, storeProductDao.getListOfWinterActiveProducts(3, true).size());

	}

}
