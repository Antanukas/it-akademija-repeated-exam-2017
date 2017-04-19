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

    public String nameOfItem;

    public double price;

    @ManyToOne
    public ShoppingCartEntity cart;

    public void setId(Long id){
        this.id = id;
    }

    public String getNameOfItem(){
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem){
        this.nameOfItem = nameOfItem;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public ShoppingCartEntity getCart(){
        return cart;
    }

    public void setCart(ShoppingCartEntity cart){
        this.cart = cart;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getString() {
        return nameOfItem;
    }

    @Override
    public void setString(String s) {
        this.nameOfItem = s;
    }

}
