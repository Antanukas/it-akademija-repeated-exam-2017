package lt.akademija.jpaexam.core;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Gabriele on 2017-03-20.
 */
public class ShoppingCartEntity implements UniqueEntityWithAssociation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    @OneToMany(mappedBy="cart", cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    public Collection<ItemEntity> items;

    public double sum;

    public void setId(Long id){
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum){
        this.sum = sum;
    }

    public Collection<ItemEntity> getItems(){
        return items;
    }

    public void setItems (Collection<ItemEntity> items){
        this.items = items;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Collection<? extends UpdatableEntity> oneToMany() {
        return items;
    }

}
