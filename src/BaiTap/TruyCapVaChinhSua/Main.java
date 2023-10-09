package BaiTap.TruyCapVaChinhSua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyClass mcl = new MyClass();
        String str = mcl.getMyString();
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần cập nhật");
        String strUpdate = sc.nextLine();
        mcl.setMyString(strUpdate);
        System.out.println(mcl.getMyString());
    }
}
