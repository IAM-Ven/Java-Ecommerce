package net.eyoel.javaecom_backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.eyoel.javaecom_backend.dto.StoreReview;

@Repository("storeReviewDao")
@Transactional
public class StoreReviewDaoImpl implements StoreReviewDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	// GET A SINGLE PRODUCT
	public List<StoreReview> getStoreReview(int product_id) {
		String storeReviewQuery = "FROM StoreReview WHERE product_id = :product_id";
		return this.sessionFactory.getCurrentSession().createQuery(storeReviewQuery, StoreReview.class)
				.setParameter("product_id", product_id).getResultList();
	}

}
