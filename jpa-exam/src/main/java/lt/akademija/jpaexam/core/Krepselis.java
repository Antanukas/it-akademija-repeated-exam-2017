package lt.akademija.jpaexam.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;





@Entity
public class Krepselis implements UniqueEntityWithAssociation {

	@Id
	@GeneratedValue
    private Long id;
	
	private String Numeris;
    private Date prikimoData;
    
    @OneToMany
    @JoinColumn(name = "krepselis_id")
    private List<Prekes> prekes;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Collection<? extends UpdatableEntity> oneToMany() {
        if (prekes == null) {
            prekes = new ArrayList<>();
        }
        return prekes;
	}

	public Date getPrikimoData() {
		return prikimoData;
	}

	public void setPrikimoData(Date prikimoData) {
		this.prikimoData = prikimoData;
	}

	public String getNumeris() {
		return Numeris;
	}

	public void setNumeris(String numeris) {
		Numeris = numeris;
	}

}
