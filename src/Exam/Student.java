package Exam;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String birthDay;
    private String address;
    private String gender;
    private String phone;

    static int count = 1;

    public int getStudentId() {
        return studentId;
    }

    public Student() {
        this.studentId = count++;
    }

    public Student(String studentName, String birthDay, String address, String gender, String phone) {
        this.studentId = count++;
        this.studentName = studentName;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public void inputData(Student[] students, int numStudents) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã sinh viên :" + studentId);
        System.out.print("Nhập tên sinh viên : ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.err.print("Tên sinh viên không được để trống, hãy nhập lại : ");
            name = scanner.nextLine().trim();
        }
        this.studentName = name;
        System.out.print("Nhập ngày sinh (ngày-tháng-năm) : ");
        String date = scanner.nextLine().trim();
        while (date.isEmpty()) {
            System.err.print("Ngày sinh không được để trống, hãy nhập lại : ");
            date = scanner.nextLine().trim();
        }
        this.birthDay = date;
        System.out.print("Nhập địa chỉ : ");
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.err.print("Địa chỉ không được để trống, hãy nhập lại : ");
            str = scanner.nextLine().trim();
        }
        this.address = str;
        System.out.print("Nhập giới tính : ");
        String gen = scanner.nextLine().trim();
        while (gen.isEmpty()) {
            System.err.print("Ngày sinh không được để trống, hãy nhập lại : ");
            gen = scanner.nextLine().trim();
        }
        this.gender = gen;
        System.out.print("Nhập số điện thoại : ");
        String phone = scanner.nextLine().trim();
        boolean check = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].phone == phone) {
                check = true;
            }
        }
        while (phone.length() != 10 || check || phone.charAt(0) != '0') {
            System.err.print("Số điện thoại chưa đủ 10 số hoặc bị trùng lặp, hãy nhập lại : ");
            phone = scanner.nextLine().trim();
            check = false;
            for (int i = 0; i < numStudents; i++) {
                if (students[i].phone == phone) {
                    check = true;
                }
            }
        }
        this.phone = phone;
    }

    public String displayData() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
