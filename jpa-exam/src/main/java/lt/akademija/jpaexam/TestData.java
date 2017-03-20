package lt.akademija.jpaexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lt.akademija.jpaexam.core.Library;

@SpringBootApplication
public class TestData {

    public Library getNewEntity1() {
        /*
         * Replace this code with construction code for your entity
         */
        Library myLibrary = new Library();
        return myLibrary;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestData.class, args);
    }
}
