package com.rtb.products.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsController {

	Logger logger = LoggerFactory.getLogger(ProductsController.class);

	@GetMapping("/")
	public Object getAllProducts() {
		logger.info("Returning all the products");
		return "All Products";
	}

	@GetMapping("/{productid}")
	public Object getProduct(@PathVariable(name = "productid") String productId) {
		logger.info("Returning product details of {}", productId);
		return "Product: " + productId;
	}
}
