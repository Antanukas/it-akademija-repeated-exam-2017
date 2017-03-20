package lt.akademija.jpaexam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lt.akademija.jpaexam.core.UpdatableEntity;

@Entity
public class ItemEntity implements UpdatableEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
    private Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String getString() {
		return name;
	}

	@Override
	public void setString(String s) {
		this.name = s;
		
	}
	
	
	
}
