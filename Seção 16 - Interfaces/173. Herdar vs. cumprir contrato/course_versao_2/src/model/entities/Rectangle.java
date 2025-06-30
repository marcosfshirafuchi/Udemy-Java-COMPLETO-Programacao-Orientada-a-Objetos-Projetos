package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape{

    private Double width;
    private Double heigth;

    public Rectangle(Color color, Double width, Double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }


    @Override
    public double area() {
        return width * heigth;
    }
}
