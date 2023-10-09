package BaiTap.LopChiGhi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student std1 = new Student();
        System.out.println(std1);
        System.out.println("Nhập tên học sinh");
        std1.setName(scanner.nextLine());
        System.out.println("Nhập lớp của học sinh");
        std1.setClasses(scanner.nextLine());
        System.out.println(std1);
    }
}
