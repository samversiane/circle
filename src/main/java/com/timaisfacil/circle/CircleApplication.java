package com.timaisfacil.circle;

import com.timaisfacil.circle.entities.Circle;
import com.timaisfacil.circle.services.CircleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CircleApplication {

    public static void main(String[] args) {

        SpringApplication.run(CircleApplication.class, args);

        Circle circle = new Circle();
        circle.setX(2);
        circle.setY(3);
        circle.setRadius(2);

        CircleService service = new CircleService();
        service.calcCircle(circle).forEach((s, p) -> {
            System.out.println(s + " " + Arrays.toString(p));
        });

    }
}