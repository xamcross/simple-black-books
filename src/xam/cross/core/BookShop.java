package xam.cross.core;

import java.util.List;

public class BookShop {

	private List<Book> books;
	private List<Customer> customers;

	public BookShop(List<Book> books, List<Customer> customers) {
		this.books = books;
		this.customers = customers;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}