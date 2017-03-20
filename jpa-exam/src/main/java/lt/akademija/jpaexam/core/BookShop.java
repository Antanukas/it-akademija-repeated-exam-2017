
package lt.akademija.jpaexam.core;

import javax.persistence.*;
import java.util.Collection;

public class BookShop implements UniqueEntityWithAssociation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	@OneToMany( cascade = CascadeType.ALL)
	public Collection<Book> books;

	public Double sum;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public Collection<? extends UpdatableEntity> oneToMany() {
		return books;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
