package com.ty.food.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.food.dto.Product;
import com.ty.food.service.ProductService;

@Controller
public class ProductControler {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/productload")
	public ModelAndView loadProduct(ModelAndView modelAndView) {
		modelAndView.setViewName("addproduct.jsp");
		modelAndView.addObject("product", new Product());
		return modelAndView;
	}
	@RequestMapping("/saveproduct")
	public ModelAndView saveProduct(@ModelAttribute Product product) {
		productService.saveProduct(product);
		ModelAndView modelAndView=new ModelAndView("adminmenu.jsp");
		modelAndView.addObject("dproduct", "Saved");
		return modelAndView;
	}
	@RequestMapping("/productsall")
	public ModelAndView getAllProducts() {
		List<Product> products=productService.getAllProducts();
		ModelAndView modelAndView=new ModelAndView("productlist.jsp");
		modelAndView.addObject("products", products);
		return modelAndView;
	}
	@RequestMapping("/editproducts")
	public ModelAndView editProduct(@RequestParam(value = "id")int id) {
		Product product=productService.getProductById(id);
		ModelAndView modelAndView=new ModelAndView("updateproduct.jsp");
		modelAndView.addObject("product", product);
		return modelAndView;
	}
	@RequestMapping("/update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {
		boolean flag=productService.updateProduct(product.getId(), product);
		if(flag) {
		ModelAndView modelAndView=new ModelAndView("productlist.jsp");
		modelAndView.addObject("update", "update Sucessfully");
		return modelAndView;
		}else {
			ModelAndView modelAndView=new ModelAndView("editproducts");
			modelAndView.addObject("product", "Not Edit");
			return modelAndView;
		}
	}
	@RequestMapping("/deleteproducts")
	public ModelAndView deleteProduct(@RequestParam(value = "id") int id) {
		productService.deletProduct(id);
		ModelAndView modelAndView=new ModelAndView("productlist.jsp");
		modelAndView.addObject("delete", "Deleted sucessfully");
		return modelAndView;
	}
}
