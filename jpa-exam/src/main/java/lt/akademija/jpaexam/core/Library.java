package lt.akademija.jpaexam.core;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Library {

//@Entity
//public class Library implements UniqueEntity {
//
//    /**
//     * Simple name of the library
//     */
//    private String name;
//
//    /**
//     * Readers are people registered to particular library.
//     */
//    @OneToMany(cascade=CascadeType.ALL)
//    private List<Book> books;
//
//    Long id = 0L;
//    
//	@Override
////	@Id
////	@GeneratedValue(strategy=GenerationType.AUTO)
//	public Long getId() {
//		// TODO Auto-generated method stub
//		//return null;
//		id++;
//		
//		return id;
//	}
}