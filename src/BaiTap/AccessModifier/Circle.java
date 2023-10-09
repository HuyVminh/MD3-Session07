package BaiTap.AccessModifier;

import java.util.Scanner;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void getArea() {
        System.out.println("Diện tích hình tròn = " + (radius * radius * 3.14));
    }
}
