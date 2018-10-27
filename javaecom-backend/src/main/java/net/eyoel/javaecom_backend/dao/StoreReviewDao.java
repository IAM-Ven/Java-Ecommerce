package net.eyoel.javaecom_backend.dao;

import java.util.List;

import net.eyoel.javaecom_backend.dto.StoreReview;

public interface StoreReviewDao {

	List<StoreReview> getStoreReview(int product_id);
}
