package xam.cross.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import xam.cross.config.BookShopConfig;

public class BookShopMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BookShopConfig.class);
		BookShop bookShop = (BookShop) context.getBean("Black Books");
		for (Customer customer :bookShop.getCustomers()){
			System.out.println(customer);
		}

		context.close();
	}

}
