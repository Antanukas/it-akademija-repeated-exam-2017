package lt.itakademija.model.command;

import io.swagger.annotations.ApiModel;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by mariusg on 2017.03.19.
 */
@Component
@ApiModel(description="Create Message")
public final class CreateMessage {

    @NotNull
    @NotBlank
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateMessage{");
        sb.append("text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
