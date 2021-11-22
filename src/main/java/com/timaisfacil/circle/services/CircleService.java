package com.timaisfacil.circle.services;

import com.timaisfacil.circle.entities.Circle;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class CircleService {

    public Map<String, Integer[]> calcCircle(Circle circle) {

        Map<String, Integer[]> mapCircle = new LinkedHashMap<>();
        mapCircle.put("circleCenter", new Integer[]{circle.getX(), circle.getY()});
        mapCircle.put("circleTop", new Integer[]{circle.getX() + circle.getRadius(), circle.getY()});
        mapCircle.put("circleBottom", new Integer[]{circle.getX() - circle.getRadius(), circle.getY()});
        mapCircle.put("circleRight", new Integer[]{circle.getX(), circle.getY() + circle.getRadius()});
        mapCircle.put("circleLeft", new Integer[]{circle.getX(), circle.getY() - circle.getRadius()});

        return mapCircle;
    }
}
