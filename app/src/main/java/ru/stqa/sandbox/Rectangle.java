package ru.stqa.sandbox;

public class Rectangle {

    public double sideA;
    public double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area() {
        return this.sideA * this.sideB;
    }
}
