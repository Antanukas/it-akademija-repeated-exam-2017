package lt.akademija.jpaexam;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lt.akademija.jpaexam.core.UniqueEntityWithAssociation;
import lt.akademija.jpaexam.core.UpdatableEntity;

@Entity
public class CartEntity implements UniqueEntityWithAssociation{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String accountName;
	
	
	@Override
	public Long getId() {
		return id;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ItemEntity> items;
	
	@Override
	public Collection<? extends UpdatableEntity> oneToMany() {
		return  items;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemEntity> items) {
		this.items = items;
	}



	
	
	

	
	
	
	

}
