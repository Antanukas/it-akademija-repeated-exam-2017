package lt.akademija.jpaexam.core;

import javax.persistence.*;

/**
 * Created by osvaldas on 17.3.20.
 */
@Entity
public class ProductEntity implements UpdatableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productManufacturerTitle;

    @ManyToOne
    private ProductCartEntity productCart;

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductManufacturerTitle() {
        return productManufacturerTitle;
    }

    public void setProductManufacturerTitle(String productManufacturerTitle) {
        this.productManufacturerTitle = productManufacturerTitle;
    }

    public ProductCartEntity getProductCart() {
        return productCart;
    }

    public void setProductCart(ProductCartEntity productCart) {
        this.productCart = productCart;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getString() {
        return productManufacturerTitle;
    }

    @Override
    public void setString(String s) {
        this.productManufacturerTitle = s;
    }
}
