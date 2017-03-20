package lt.akademija.jpaexam;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Transactional
public class TestData {

    public Object getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        CartEntity cartEntity = new CartEntity();
        cartEntity.setAccountName("Tomo Cart");
        
        List<ItemEntity> items = new ArrayList<>();
        
        ItemEntity agurkas = new ItemEntity();
        ItemEntity burokas = new ItemEntity();
        
        items.add(agurkas);
        items.add(burokas);
        
        cartEntity.setItems(items);
        
        
        return cartEntity;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
