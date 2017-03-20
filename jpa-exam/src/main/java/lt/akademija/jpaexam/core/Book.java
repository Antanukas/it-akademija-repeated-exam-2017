package lt.akademija.jpaexam.core;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Book { 

//@Entity
//public class Book implements UpdatableEntity {
//
//
//
//    private String title;
//
//
//    public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	@OneToMany
//    private List<Library> library;
//    
//    Long id = 0L;
//
//	@Override
////	@Id
////	@GeneratedValue(strategy=GenerationType.AUTO)
//	public Long getId() {
//		id++;
//		//return null;
//		return id;
//	}
//
//	@Override
//	public String getString() {
//		// TODO Auto-generated method stub
//		return title;
//		
//	}
//
//	@Override
//	public void setString(String s) {
//		this.title = title;
//		
//	}
//

}
