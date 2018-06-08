package net.eyoel.javaecom_backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.eyoel.javaecom_backend.dto.StoreProduct;

@Repository("productDao")
@Transactional
public class StoreProductImpl implements StoreProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	// GET A SINGLE PRODUCT
	public StoreProduct getStoreProduct(int productId) {
		try {
			return this.sessionFactory.getCurrentSession().get(StoreProduct.class, Integer.valueOf(productId));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	// ADD A SINGLE PRODUCT
	public boolean addProduct(StoreProduct product) {
		try {
			this.sessionFactory.getCurrentSession().persist(product);
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	// UPDATE A SINGLE PRODUCT
	public boolean updateProduct(StoreProduct product) {
		try {
			this.sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return false;
	}

	@Override
	// DELETE A SINGLE PRODUCT
	public boolean deleteProduct(StoreProduct product) {
		try {
			product.setActive(false);
			return this.updateProduct(product);
		} catch (Exception ex) {
			ex.printStackTrace();
			;
		}
		return false;
	}

	/*------------------List of Products-----------------*/
	@Override
	// GET LIST OF ALL PRODUCTS
	public List<StoreProduct> getListOfAllProducts() {

		return this.sessionFactory.getCurrentSession().createQuery("from StoreProduct", StoreProduct.class)
				.getResultList();
	}

	@Override
	// GET LIST OF ALL ACTIVE PRODUCTS
	public List<StoreProduct> getListOfAllActiveProducts() {
		String activeProductsDb = "from StoreProduct where active = :active";

		return this.sessionFactory.getCurrentSession().createQuery(activeProductsDb, StoreProduct.class)
				.setParameter("active", true).getResultList();
	}

	@Override
	// GET LIST OF ALL ACTIVE PRODUCTS BY CATEGORY ID
	public List<StoreProduct> getListOfAllActiveProductsByCategory(int categoryId) {
		String activeProductsByIdDb = "from StoreProduct where active = :active and categoryId = :category_id";

		return this.sessionFactory.getCurrentSession().createQuery(activeProductsByIdDb, StoreProduct.class)
				.setParameter("active", true).setParameter("category_id", categoryId).getResultList();
	}

	@Override
	// GET LIST OF RECENT ACTIVE PRODUCTS BY COUNT WE WANT
	public List<StoreProduct> getListOfRecentActiveProducts(int count) {
		String activeRecentProducts = "from StoreProduct where active = :active order by id"; // recent items are on top
																								// stack
		return this.sessionFactory.getCurrentSession().createQuery(activeRecentProducts, StoreProduct.class)
				.setParameter("active", true).setFirstResult(0).setMaxResults(count).getResultList();
	}

	@Override
	// GET LIST OF POPULAR ACTIVE PRODUCTS BY COUNT WE WANT
	public List<StoreProduct> getListOfPopularActiveProducts(int count) {
		String activePopularProducts = "from StoreProduct where active = :active order by purchases"; // recent items
																										// are on top
		// stack
		return this.sessionFactory.getCurrentSession().createQuery(activePopularProducts, StoreProduct.class)
				.setParameter("active", true).setFirstResult(0).setMaxResults(count).getResultList();
	}

	@Override
	// GET LIST OF SUMMER ACTIVE PRODUCTS BY COUNT WE WANT
	public List<StoreProduct> getListOfSummerActiveProducts(int count, boolean summer) {
		String activeSummerProductsDb = "from StoreProduct where active = :active and summer = :summer";

		return this.sessionFactory.getCurrentSession().createQuery(activeSummerProductsDb, StoreProduct.class)
				.setParameter("active", true).setParameter("summer", summer).getResultList();
	}

	@Override
	// GET LIST OF WINTER ACTIVE PRODUCTS BY COUNT WE WANT
	public List<StoreProduct> getListOfWinterActiveProducts(int count, boolean winter) {
		String activeWinterProductsDb = "from StoreProduct where active = :active and winter = :winter";

		return this.sessionFactory.getCurrentSession().createQuery(activeWinterProductsDb, StoreProduct.class)
				.setParameter("active", true).setParameter("winter", winter).getResultList();
	}

}
