package lt.itakademija.model.command;

import io.swagger.annotations.ApiModel;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
public final class UpdateContact {

    @NotNull
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
