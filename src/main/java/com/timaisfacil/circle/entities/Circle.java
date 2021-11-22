package com.timaisfacil.circle.entities;

import java.io.Serializable;

public class Circle implements Serializable {

    private Integer x;
    private Integer y;
    private Integer radius;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

}
