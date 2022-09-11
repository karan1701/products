package com.rtb.products.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rtb.products.model.BookDetails;
import com.rtb.products.model.BookInfo;
import com.rtb.products.model.BookReview;

@RestController
@RequestMapping("/product")
public class ProductsController {

	Logger logger = LoggerFactory.getLogger(ProductsController.class);

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	public List<BookDetails> getAllBooks() {
		logger.info("Getting all the books");
		// Add a call to book details MS
		List<BookDetails> booksList = restTemplate.getForObject("http://bookdetails-app-svc/bookdetails/", List.class);
		return booksList;
	}

	@GetMapping("/{bookid}")
	public BookInfo getBookByBookId(@PathVariable(name = "bookid") Integer bookId) {
		logger.info("Getting book details of {}", bookId);
		BookDetails bookDetail = restTemplate.getForObject("http://bookdetails-app-svc/bookdetails/" + bookId,
				BookDetails.class);
		List<BookReview> bookReviews = restTemplate.getForObject("http://reviews-app-svc/review/" + bookId, List.class);
		BookInfo bookInfo = new BookInfo(bookDetail, bookReviews);
		// Call bookdetails ms and review ms
		return bookInfo;
	}
}
