package xam.cross.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xam.cross.core.Book;
import xam.cross.core.BookShop;
import xam.cross.core.Customer;
import xam.cross.core.ShoppingCart;

@Configuration
public class BookShopConfig {

	@Bean(name="Black Books")
	public BookShop bookShop(){
		return new BookShop(bookList(), customers());
	}
	
	@Bean
	public List<Book> bookList(){
		List<Book> books = new ArrayList<>();
		
		Book harryPotter = new Book();
		harryPotter.setId(0);
		harryPotter.setTitle("Harry Potter");
		harryPotter.setAuthors("Joan Rowling");
		harryPotter.setDescription("A story of a 4-eyed schoolkid");
		
		books.add(harryPotter);
		
		Book mobbyDick = new Book();
		mobbyDick.setId(1);
		mobbyDick.setTitle("Mobby Dick");
		mobbyDick.setAuthors("Aaron Eckhart");
		mobbyDick.setDescription("A story of a pale animal");
		
		books.add(mobbyDick);
		
		return books;
	}
	
	@Bean
	public List<Customer> customers(){
		List<Customer> customers = new ArrayList<>();

		customers.add(vasia());

		customers.add(petia());
		
		return customers;
	}
	
	@Bean
	public Customer vasia(){
		ShoppingCart cart = new ShoppingCart(emptyBookList());
		Customer vasia = new Customer(cart);
		vasia.setId(0);
		vasia.setUsername("Vasia");
		vasia.setPassword("vasia123");
		cart.setCustomer(vasia);
		return vasia;
	}
	
	@Bean
	public Customer petia(){
		ShoppingCart cart = new ShoppingCart(emptyBookList());
		Customer petia = new Customer(cart);
		petia.setId(1);
		petia.setUsername("Petia");
		petia.setPassword("petia123");
		cart.setCustomer(petia);
		return petia;
	}
	
	@Bean
	public List<Book> emptyBookList(){
		return new ArrayList<Book>();
	}
	
}
