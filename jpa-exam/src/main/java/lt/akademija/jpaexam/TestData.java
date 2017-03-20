package lt.akademija.jpaexam;

import lt.akademija.jpaexam.core.ProductCartEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestData {

    public Object getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        ProductCartEntity yourObject = new ProductCartEntity();
        return yourObject;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
