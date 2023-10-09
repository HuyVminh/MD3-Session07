package BaiTap.AccessModifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn :");
        double r = scanner.nextDouble();
        Circle TestCircle = new Circle(r);
        System.out.println(TestCircle.getRadius());;
        TestCircle.getArea();
    }
}
