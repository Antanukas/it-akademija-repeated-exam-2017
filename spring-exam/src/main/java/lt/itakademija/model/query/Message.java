package lt.itakademija.model.query;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by mariusg on 2017.03.19.
 */
public final class Message {

    @NotNull
    @NotBlank
    private Long id;

    @NotNull
    @NotBlank
    private String text;

    public Message(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
