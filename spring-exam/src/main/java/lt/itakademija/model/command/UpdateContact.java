package lt.itakademija.model.command;

import org.springframework.stereotype.Service;

/**
 * Created by mariusg on 2017.03.19.
 */
@Service
public final class UpdateContact {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
