package lt.akademija.jpaexam.core;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lenovo on 3/20/2017.
 */
@Entity
public class ToysCart implements UniqueEntityWithAssociation {

    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long toyId;

    @OneToMany
    private List<UpdatableEntity> toys;

    @Override
    public Long getId() {
        return toyId;
    }

    @Override
    public Collection<? extends UpdatableEntity> oneToMany() {
        return toys;
    }
}
