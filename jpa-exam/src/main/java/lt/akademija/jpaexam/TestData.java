package lt.akademija.jpaexam;

import lt.akademija.jpaexam.core.Book;
import lt.akademija.jpaexam.core.BookShop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestData {

	public BookShop getNewEntity1() {
		BookShop bookShop = new BookShop();

		Book book = new Book();
		
		book.setString("1984");
		book.setPrice(11.0);
		book.setBookShop(bookShop);

		return bookShop;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestData.class, args);
	}
}
