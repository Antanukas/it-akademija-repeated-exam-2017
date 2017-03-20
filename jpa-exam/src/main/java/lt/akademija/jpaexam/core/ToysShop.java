package lt.akademija.jpaexam.core;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by lenovo on 3/20/2017.
 */
@Entity
public class ToysShop implements UpdatableEntity {

    @NotNull
    private Long toyId;
    @NotNull
    private String simpleName;

    @Override
    public Long getId() {
        return toyId;
    }

    @Override
    public String getString() {
        return simpleName;
    }

    @Override
    public void setString(String simpleName) {
        this.simpleName = simpleName;
    }


}
