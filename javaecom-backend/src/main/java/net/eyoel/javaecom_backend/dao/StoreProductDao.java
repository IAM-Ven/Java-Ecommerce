package net.eyoel.javaecom_backend.dao;

import java.util.List;

import net.eyoel.javaecom_backend.dto.StoreProduct;

public interface StoreProductDao {
	StoreProduct getStoreProduct(int productId);

	boolean addProduct(StoreProduct product);

	boolean updateProduct(StoreProduct product);

	boolean deleteProduct(StoreProduct product);

	List<StoreProduct> getListOfAllProducts();

	List<StoreProduct> getListOfAllActiveProducts();

	List<StoreProduct> getListOfAllActiveProductsByCategory(int categoryId);

	List<StoreProduct> getListOfRecentActiveProducts(int count);

	List<StoreProduct> getListOfPopularActiveProducts(int count);

	List<StoreProduct> getListOfSummerActiveProducts(int count, boolean summer);

	List<StoreProduct> getListOfWinterActiveProducts(int count, boolean winter);

}
