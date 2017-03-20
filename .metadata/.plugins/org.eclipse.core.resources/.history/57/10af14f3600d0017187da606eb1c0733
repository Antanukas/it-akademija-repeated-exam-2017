package lt.akademija.jpaexam.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements UpdatableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
   
    public Book(String name){
        this.name=name;
    }
    public Book(){};
    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getString() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setString(String name) {
        // TODO Auto-generated method stub

        this.name=name;
    }

}
