package org.patterns.Creational.Factory;

public class Main {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.showShape();

        Shape square = ShapeFactory.getShape("square");
        square.showShape();
    }
}
