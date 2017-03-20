package lt.akademija.jpaexam.core;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Prekes implements UpdatableEntity {
	@Id
	@GeneratedValue
	private Long id;

	private String productName;

	@OneToMany
	@JoinColumn(name = "prekes_id")
	private List<Krepselis> krepselis;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return productName;
	}

	@Override
	public void setString(String productName) {
		this.productName = productName;

	}

}
