package lt.akademija.jpaexam;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lt.akademija.jpaexam.core.Krepselis;

@SpringBootApplication
public class TestData {

    public Object getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        Krepselis krepselis = new Krepselis();
        return krepselis;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
