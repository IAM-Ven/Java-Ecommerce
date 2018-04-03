package net.eyoel.javaecom_backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.eyoel.javaecom_backend.dto.StoreCategory;

@Repository("storeCategoryDao")
@Transactional
public class StoreCategoryDaoImpl implements StoreCategoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public StoreCategory getStoreCategoryId(int id) {

		return sessionFactory.getCurrentSession().get(StoreCategory.class, Integer.valueOf(id));
	}

	@Override
	public List<StoreCategory> getStoreCategoryList() {
		String activeStoreCategory = "FROM StoreCategory WHERE active = :active";
		Query<StoreCategory> query = sessionFactory.getCurrentSession().createQuery(activeStoreCategory);
		query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	// Add store categories to the database
	public boolean addStoreCategory(StoreCategory storeCategory) {
		try {
			// If the try went threw properly, return true
			sessionFactory.getCurrentSession().persist(storeCategory);
			return true;
		} catch (Exception ex) {
			// If threw exception, return false
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	// Update the store category
	public boolean updateStoreCategory(StoreCategory storeCategory) {
		try {
			// If the try went threw properly, return true
			sessionFactory.getCurrentSession().update(storeCategory);
			return true;

		} catch (Exception ex) {
			// If it threw exception, return false
			ex.printStackTrace();
		}

		return false;
	}

	@Override
	// Delete a category from the store
	public boolean deleteStoreCategory(StoreCategory storeCategory) {
		try {
			// if the try went threw properly, return true
			sessionFactory.getCurrentSession().update(storeCategory);
			return true;
		} catch (Exception ex) {
			// If it threw exception, return false
			ex.printStackTrace();
		}
		return false;
	}

}
