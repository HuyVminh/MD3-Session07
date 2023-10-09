package BaiTap.XayDungCacPhuongThucTinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("========MENU=============\n" +
                    "1. Tính diện tích hình tròn\n" +
                    "2, Tính diện tích hình chữ nhật\n" +
                    "3. Tính diện tích hình tam giác\n" +
                    "4. Thoát\n" +
                    "==========================================");
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập bán kính hình tròn");
                    double r = scanner.nextDouble();
                    StaticMethod.calCircleArea(r);
                    break;
                case 2:
                    System.out.println("Nhập chiều rộng hình chữ nhật");
                    double width = scanner.nextDouble();
                    System.out.println("Nhập chiều cao hình chữ nhật");
                    double height = scanner.nextDouble();
                    StaticMethod.calRectangleArea(width, height);
                    break;
                case 3:
                    System.out.println("Nhập cạnh a hình tam giác");
                    double a = scanner.nextDouble();
                    System.out.println("Nhập cạnh b hình tam giác");
                    double b = scanner.nextDouble();
                    System.out.println("Nhập cạnh c hình tam giác");
                    double c = scanner.nextDouble();
                    StaticMethod.calTriangleArea(a, b, c);
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình");
                    break;
                default:
                    break;
            }

        }
    }
}
