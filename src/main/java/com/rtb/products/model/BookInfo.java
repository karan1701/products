package com.rtb.products.model;

import java.util.List;

public class BookInfo {

	private BookDetails details;
	private List<BookReview> reviews;

	public BookInfo(BookDetails details, List<BookReview> reviews) {
		super();
		this.details = details;
		this.reviews = reviews;
	}

	public BookDetails getDetails() {
		return details;
	}

	public void setDetails(BookDetails details) {
		this.details = details;
	}

	public List<BookReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<BookReview> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Product [details=" + details + ", reviews=" + reviews + "]";
	}

}
