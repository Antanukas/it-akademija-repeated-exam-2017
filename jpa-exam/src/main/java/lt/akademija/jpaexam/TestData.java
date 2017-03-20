package lt.akademija.jpaexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lt.akademija.jpaexam.core.Examiner;

@SpringBootApplication
public class TestData {

    public Examiner getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        Examiner myLibrary = new Examiner();
        return myLibrary;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
