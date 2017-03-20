package lt.itakademija.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class Id {

    @NotNull
    @NotBlank
    private final Long id;

    public Id(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
