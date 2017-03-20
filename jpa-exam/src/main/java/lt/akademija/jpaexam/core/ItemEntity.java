package lt.akademija.jpaexam.core;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * Created by Gabriele on 2017-03-20.
 */
public class ItemEntity implements UpdatableEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public ShoppingCartEntity cart;

    @NotNull
    public String nameOfItem;

    @NotNull
    public Double price;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getString() {
        return nameOfItem;
    }

    @Override
    public void setString(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public Double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public ShoppingCartEntity getCart(){
        return cart;
    }
    public void setCart(ShoppingCartEntity cart){
        this.cart = cart;
    }
}
