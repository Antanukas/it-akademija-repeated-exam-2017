package lt.akademija.jpaexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lt.akademija.jpaexam.core.CarsCollection;

@SpringBootApplication
public class TestData {

    public CarsCollection getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        CarsCollection myCarsCollection = new CarsCollection();
        return myCarsCollection;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
