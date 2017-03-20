package lt.akademija.jpaexam.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dainius on 2017-03-20.
 */

@Entity
public class Product implements UpdatableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Product's description
     */
    private String description;

    public Product(String description) {
        this.description = description;
    }

    public Product() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getString() {
        // TODO Auto-generated method stub
        return description;
    }

    @Override
    public void setString(String name) {
        // TODO Auto-generated method stub
        this.description=description;
    }

}
