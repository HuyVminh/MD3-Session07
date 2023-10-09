package Exam;

import java.util.Scanner;

public class Exam_Advance {
    static Student[] students = new Student[100];
    static int numStudents = 0;

    public static void main(String[] args) {
        students[numStudents++] = new Student("Vu Minh Huy", "11-11-1991", "Ha Noi", "Nam", "0123456789");
        students[numStudents++] = new Student("Dao Huu Thinh", "03-03-2001", "Nghe An", "Nam", "0123123123");
        students[numStudents++] = new Student("Duong Viet Anh", "03-04-1993", "Ha Noi", "Nam", "0987654321");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("==============MENU================\n" +
                    "1. Quản lý học sinh\n" +
                    "2. Quản lý môn học\n" +
                    "3. Quản lý điểm thi\n" +
                    "4. Thoát");
            System.out.println("Nhập lựa chọn của bạn :");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManagement(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static void studentManagement(Scanner scanner) {
        int choice1 = 0;
        while (choice1 != 5) {
            System.out.println("===========STUDENT-MANAGEMENT===============\n" +
                    "1. Thêm mới học sinh\n" +
                    "2. Hiển thị danh sách tất cả học sinh đã lưu trữ\n" +
                    "3. Thay đổi thông tin học sinh theo mã ID\n" +
                    "4. Xóa học sinh theo mã ID\n" +
                    "5. Thoát");
            System.out.println("Nhập lựa chọn của bạn :");
            choice1 = scanner.nextInt();
            scanner.nextLine();
            switch (choice1) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    updateStudentInformation();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static void addNewStudent() {
        if (numStudents == 100) {
            System.out.println("Không thể thêm sinh viên mới. Số lượng sinh viên đã tối đa");
        } else {
            Student newStudent = new Student();
            newStudent.inputData(students, numStudents);
            students[numStudents] = newStudent;
            numStudents++;
            System.out.println("Đã thêm sinh viên thành công");
        }
    }

    private static void displayAllStudents() {
        if (numStudents == 0) {
            System.out.println("Không có sinh viên nào");
        } else {
            System.out.println("============== Danh sách sinh viên =================================================");
            for (int i = 0; i < numStudents; i++) {
                System.out.println(students[i].displayData());
                ;
            }
        }
    }

    private static void updateStudentInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentId() == id) {
                students[i].inputData(students, numStudents);
                System.out.println("Thông tin sinh viên đã được cập nhật thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thông tin sinh viên.");
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentId() == id) {
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numStudents--;
                System.out.println("Xóa sinh viên thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }
}
