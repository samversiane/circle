package com.timaisfacil.circle.entities;

import java.io.Serializable;

public class Circle implements Serializable {

    private Double x;
    private Double y;
    private Double radius;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
