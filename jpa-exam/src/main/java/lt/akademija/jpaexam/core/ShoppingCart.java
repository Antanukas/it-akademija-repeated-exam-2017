package lt.akademija.jpaexam.core;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Dainius on 2017-03-20.
 */
@Entity
public class ShoppingCart implements UniqueEntityWithAssociation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Type of shopping cart (shopping cart is in a mall, so you can fill it in different stores. For example: toys, food and so on)
     */
    private String type;

    /**
     * All the products that are in the shopping cart
     */
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST},
            fetch = FetchType.EAGER)
    private List<Product> productList = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Collection<? extends UpdatableEntity> oneToMany() {
        return productList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}
