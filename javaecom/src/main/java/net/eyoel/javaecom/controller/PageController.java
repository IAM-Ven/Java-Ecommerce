package net.eyoel.javaecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.eyoel.javaecom_backend.dao.*;
import net.eyoel.javaecom_backend.dto.*;

@Controller
public class PageController {

	@Autowired // this instantiates the Dao interface class & also getters and setters
	private StoreCategoryDao storeCategoryDao = null;
	@Autowired
	private StoreProductDao storeProductDao = null;

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");

		// passing list of cloth category objects
		mv.addObject("clothCategories", storeCategoryDao.getStoreCategoryList());
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());

		// Summer
		mv.addObject("summer", storeProductDao.getListOfSummerActiveProducts(6, true));

		// Winter
		mv.addObject("winter", storeProductDao.getListOfWinterActiveProducts(6, true));

		// Popular
		mv.addObject("popular", storeProductDao.getListOfPopularActiveProducts(10));
		
		// Get the product in the home page as well
		
		//mv.addObject("product", storeProductDao.get)
		// Home page is active
		mv.addObject("homeactive", true);

		return mv;
	}

	@RequestMapping(value = { "/login" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Login");
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());
		mv.addObject("loginactive", true);

		return mv;
	}

	@RequestMapping(value = { "/account" })
	public ModelAndView account() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "My Account");
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());
		mv.addObject("accountactive", true);
		return mv;
	}

	@RequestMapping(value = { "/checkout" })
	public ModelAndView checkout() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Checkout");
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());
		mv.addObject("checkoutactive", true);
		return mv;
	}

	/* load all products regardless of categories */
	@RequestMapping(value = { "/category/all/products" })
	public ModelAndView allProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Store Products");
		mv.addObject("products", storeProductDao.getListOfAllProducts());
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());
		mv.addObject("allcatsproductsactive", true);
		return mv;
	}

	// load all products based on their categories id
	@RequestMapping(value = { "/category/{id}/products" })
	public ModelAndView allProducts(@PathVariable("id") int id) {
		StoreCategory clthcat;
		ModelAndView mv = new ModelAndView("page");
		// send id to back-end directly
		// This bottom code is returning a ClothesCategory products based on id
		clthcat = storeCategoryDao.getStoreCategoryId(id);

		mv.addObject("title", clthcat.getName() + " clothes");
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());
		
		mv.addObject("category", clthcat);
		
		mv.addObject("cateProducts", storeProductDao.getListOfAllActiveProductsByCategory(id));
		mv.addObject("onecatproductsactive", true);
		return mv;
	}

	// Get a single product by product id

	@RequestMapping(value = { "/product/{id}" })
	public ModelAndView singleProduct(@PathVariable("id") int id) {
		StoreProduct product;

		ModelAndView mv = new ModelAndView("page");

		product = storeProductDao.getStoreProduct(id);
		product.setViews(product.getViews() + 1); 
		// increament by 1 everytime someone sees it
		// storeProductDao.updateProduct(product); // update the product after adding
		// view # change

		mv.addObject("title", product.getName());
		mv.addObject("product", product);
				
		mv.addObject("productactive", true);
		return mv;
	}

}