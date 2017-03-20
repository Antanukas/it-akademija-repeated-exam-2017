package lt.akademija.jpaexam.core;

import javax.persistence.*;

public class Book implements UpdatableEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	@ManyToOne
	public BookShop shop;

	public String name;

	public Double price;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getString() {
		return name;
	}

	@Override
	public void setString(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public BookShop getBookShop() {
		return shop;
	}

	public void setBookShop(BookShop shop) {
		this.shop = shop;
	}
}
