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

    @OneToMany(mappedBy="cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Collection<ItemEntity> items;

    public Double sum;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Collection<? extends UpdatableEntity> oneToMany() {
        return items;
    }

    public Double getSum() {
        return sum;
    }
    public void setSum(Double sum){
        this.sum = sum;
    }
}
