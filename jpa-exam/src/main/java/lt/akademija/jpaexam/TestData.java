package lt.akademija.jpaexam;

import lt.akademija.jpaexam.core.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestData {

    public Object getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        ShoppingCart myShoppingCart = new ShoppingCart();
        return myShoppingCart;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
