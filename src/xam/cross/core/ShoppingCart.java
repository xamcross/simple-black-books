package xam.cross.core;

import java.util.List;

public class ShoppingCart {

	private static Integer numberOfCarts = 0;
	private Integer id;
	private List<Book> books;
	private Customer customer;

	public ShoppingCart(List<Book> books) {
		this.id = numberOfCarts;
		this.books = books;
		numberOfCarts++;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", customer=" + customer.getUsername() + ", getClass()=" + getClass() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
