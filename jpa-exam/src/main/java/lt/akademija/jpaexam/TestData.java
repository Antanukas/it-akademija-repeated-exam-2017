package lt.akademija.jpaexam;

import lt.akademija.jpaexam.core.ItemEntity;
import lt.akademija.jpaexam.core.ShoppingCartEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class TestData {

    public ShoppingCartEntity getNewEntity1() {
        ShoppingCartEntity myShoppingBasket = new ShoppingCartEntity();

        ItemEntity milk = new ItemEntity();
        milk.setString("Rokiškio");
        milk.setCart(myShoppingBasket);

        return myShoppingBasket;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
