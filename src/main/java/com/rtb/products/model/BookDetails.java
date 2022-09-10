package com.rtb.products.model;

public class BookDetails {

	String title;
	String author;
	String publisher;
	Integer price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}

	public BookDetails(String title, String author, String publisher, Integer price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public BookDetails() {
		
	}

}
