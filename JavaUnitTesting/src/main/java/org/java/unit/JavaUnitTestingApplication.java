package org.java.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaUnitTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaUnitTestingApplication.class, args);
        System.out.println("Hello World");
    }

}
