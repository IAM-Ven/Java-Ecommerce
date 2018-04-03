package net.eyoel.javaecom_backend.dao;

import java.util.List;

import net.eyoel.javaecom_backend.dto.StoreCategory;

public interface StoreCategoryDao {

	StoreCategory getStoreCategoryId(int id);

	List<StoreCategory> getStoreCategoryList();

	boolean addStoreCategory(StoreCategory storeCategory);

	boolean updateStoreCategory(StoreCategory storeCategory);

	boolean deleteStoreCategory(StoreCategory storeCategory);
}
