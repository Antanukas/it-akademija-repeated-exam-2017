package lt.akademija.jpaexam.core;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by osvaldas on 17.3.20.
 */
@Entity
public class ProductCartEntity implements UniqueEntityWithAssociation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double discountSize;
    private Date discountTermination;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name = "cart_product")
    private List<ProductEntity> products;

    public void setId(Long id) {
        this.id = id;
    }

    public double getDiscountSize() {
        return discountSize;
    }

    public void setDiscountSize(double discountSize) {
        this.discountSize = discountSize;
    }

    public Date getDiscountTermination() {
        return discountTermination;
    }

    public void setDiscountTermination(Date discountTermination) {
        this.discountTermination = discountTermination;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Collection<? extends UpdatableEntity> oneToMany() {
        return products;
    }
}
