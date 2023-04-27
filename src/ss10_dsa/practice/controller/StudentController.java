package ss10_dsa.practice.controller;

import ss10_dsa.practice.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner sc = new Scanner(System.in);
    public static StudentService studentService = new StudentService();

    public void menu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ---");
            System.out.println(" 1. Thêm mới học viên\n" +
                    "2. Xóa học viên\n" +
                    "3. Xem danh sách học viên\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    studentService.add();
                case 2:
                    studentService.delete();
                case 3:
                    studentService.getStudentList();
                case 4: {
                    System.out.println(" Bạn muốn thoát khỏi hệ thống?\n" +
                            "1.Có\n" +
                            "2.Không");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        System.out.println("Bạn đã thoát khỏi hệ thống.");
                        isFlag = false;
                    }
                }
            }
        }
    }
}
