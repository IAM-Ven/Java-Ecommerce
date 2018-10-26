package net.eyoel.javaecom_backend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.eyoel.javaecom_backend.dto.StoreSubimage;

@Repository("storeProductDao")
@Transactional
public class StoreSubimageDaoImpl implements StoreSubimageDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public StoreSubimage getSubimage(int product_id) {
		String subImageQuery = "FROM StoreSubimage WHERE product_id = :product_id";

		return this.sessionFactory.getCurrentSession().createQuery(subImageQuery, StoreSubimage.class)
				.setParameter("product_id", product_id).getSingleResult();
	}

}
