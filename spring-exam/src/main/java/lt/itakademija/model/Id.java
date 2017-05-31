package lt.itakademija.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2017.03.19.
 */

public final class Id {
    
    
    private final Long id;
    
    public Id(Long id) {
        this.id = id;
    }
    @Bean
    public Long getId() {
        return id;
    }

}
