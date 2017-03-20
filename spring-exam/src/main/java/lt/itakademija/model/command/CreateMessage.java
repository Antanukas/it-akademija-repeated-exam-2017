package lt.itakademija.model.command;

import org.springframework.stereotype.Service;

/**
 * Created by mariusg on 2017.03.19.
 */
@Service
public final class CreateMessage {

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
