package net.eyoel.javaecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.eyoel.javaecom_backend.dao.StoreCategoryDao;
import net.eyoel.javaecom_backend.dto.StoreCategory;

@Controller
public class PageController {

	@Autowired // this instantiates the Dao interface class & also getters and setters
	private StoreCategoryDao storeCategoryDao = null;

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");

		// passing list of cloth category objects
		mv.addObject("clothCategories", storeCategoryDao.getStoreCategoryList());
		mv.addObject("categories", storeCategoryDao.getStoreCategoryList());
		System.out.println(storeCategoryDao.getStoreCategoryList());
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
		mv.addObject("allproducts", storeCategoryDao.getStoreCategoryList());
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
		mv.addObject("onecatproductsactive", true);
		return mv;
	}

}