package BaiTap.XayDungCacPhuongThucTinh;

import java.util.Scanner;

public class StaticMethod {
    private static final double PI = 3.14;

    public static void calCircleArea(double r) {
        double areaCircle = r * r * PI;
        System.out.println("Diện tích hình tròn có bán kính r = " + r + " là " + areaCircle);
    }

    public static void calRectangleArea(double width, double height) {
        double areaRectangle = width * height;
        System.out.println("Diện tích hình tròn có chiều rộng = " + width + ", chiều cao = " + height + " là " + areaRectangle);
    }

    public static void calTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích hình tròn có cạnh a = " + a + ", cạnh b = " + b + ", cạnh c = " + c + " là " + areaTriangle);
    }
}
