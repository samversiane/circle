package com.timaisfacil.circle.services;

import com.timaisfacil.circle.entities.Circle;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class CircleService {

    public Map<String, Double[]> calcCircle(Circle circle) {

        Map<String, Double[]> mapCircle = new LinkedHashMap<>();
        mapCircle.put("circleCenter", new Double[]{circle.getX(), circle.getY()});
        mapCircle.put("circleTop", new Double[]{circle.getX() + circle.getRadius(), circle.getY()});
        mapCircle.put("circleBottom", new Double[]{circle.getX() - circle.getRadius(), circle.getY()});
        mapCircle.put("circleRight", new Double[]{circle.getX(), circle.getY() + circle.getRadius()});
        mapCircle.put("circleLeft", new Double[]{circle.getX(), circle.getY() - circle.getRadius()});

        //Quadrante 1
        mapCircle.put("circle30", new Double[]{
                Math.cos(Math.toRadians(30)) * circle.getRadius(),
                Math.sin(Math.toRadians(30)) * circle.getRadius()});
        mapCircle.put("circle60", new Double[]{
                Math.cos(Math.toRadians(60)) * circle.getRadius(),
                Math.sin(Math.toRadians(60)) * circle.getRadius()});

        //Quadrante 2
        mapCircle.put("circle120", new Double[]{
                Math.cos(Math.toRadians(120)) * circle.getRadius(),
                Math.sin(Math.toRadians(120)) * circle.getRadius()});
        mapCircle.put("circle150", new Double[]{
                Math.cos(Math.toRadians(150)) * circle.getRadius(),
                Math.sin(Math.toRadians(150)) * circle.getRadius()});

        //Quadrante 3
        mapCircle.put("circle210", new Double[]{
                Math.cos(Math.toRadians(210)) * circle.getRadius(),
                Math.sin(Math.toRadians(210)) * circle.getRadius()});
        mapCircle.put("circle240", new Double[]{
                Math.cos(Math.toRadians(240)) * circle.getRadius(),
                Math.sin(Math.toRadians(240)) * circle.getRadius()});

        //Quadrante 4
        mapCircle.put("circle300", new Double[]{
                Math.cos(Math.toRadians(300)) * circle.getRadius(),
                Math.sin(Math.toRadians(300)) * circle.getRadius()});
        mapCircle.put("circle330", new Double[]{
                Math.cos(Math.toRadians(330)) * circle.getRadius(),
                Math.sin(Math.toRadians(330)) * circle.getRadius()});

        return mapCircle;
    }

//    public Double[] spots(Double angle){
//       return new Double[] {Math.cos(Math.toRadians(angle)) * new Circle().getRadius(),
//               Math.sin(Math.toRadians(angle)) * new Circle().getRadius()};
//    }

}
