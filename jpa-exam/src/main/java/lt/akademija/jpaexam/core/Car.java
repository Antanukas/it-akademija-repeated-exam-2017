package lt.akademija.jpaexam.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements UpdatableEntity  {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	private String model;
	
	public Car(String model){
        this.model=model;
    }
    public Car(){};
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getString() {
		return model;
	}

	@Override
	public void setString(String model) {
		this.model=model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
