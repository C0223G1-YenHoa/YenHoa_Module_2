package mvc.mvc_1.controller;

import mvc.mvc_1.common.ReadAndWriteFile;
import mvc.mvc_1.model.Student1;
import mvc.mvc_1.service.StudentService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private final Scanner sc = new Scanner(System.in);
    private final StudentService studentService = new StudentService();
    private static final ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();


    public void showList() throws IOException {

        // add data from file.csv data.csv
//        ArrayList<Student1> studentListAddData = readAndWriteFile.readFile();
//        studentService.addAll(studentListAddData);

        boolean flag = true;
        while (flag) {
            System.out.print(" ----DANH SÁCH HỌC VIÊN----\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm học viên\n" +
                    "3. Xóa học viên\n" +
                    "4. Sửa học viên\n" +
                    "5. Thoát\n"+
                    "Xin mời chọn: ");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    studentService.displayList();
                    break;
                case 2:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập email: ");
                    String email = sc.nextLine();
                    System.out.print("Nhập điểm: ");
                    int point = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập lớp: ");
                    String classes = sc.nextLine();
                    Student1 student1 = new Student1(id, name, age, email, point, classes);
                    studentService.add(student1);
                    break;
                case 3:
                    //xóa học viên
                    System.out.println("Nhập ID bạn muốn xóa: ");
                    int choice = Integer.parseInt(sc.nextLine());
                    boolean isCheck = studentService.checkId(choice);
                    if (!isCheck) {
                        System.out.println("Không tìm thấy sinh viên này.");
                        break;
                    } else {
                        System.out.println("Bạn có chắc muốn xóa sinh viên này không?\n" +
                                "1.Có\n" +
                                "2.Không");
                        int optionDelete = Integer.parseInt(sc.nextLine());

                        if (optionDelete == 1) {
                            if (studentService.delete(choice)) {
                                System.out.println("Bạn đã xóa thành công.");
                            } else {
                                System.out.println("Xóa không thành công.");
                            }
                        } else {
                            System.out.println("Cảm ơn bạn đã truy cập.");
                        }
                    }
                    break;
                case 4:
                    //sửa học viên
                    System.out.println("Nhập ID bạn muốn sửa");
                    int optionEdit = Integer.parseInt(sc.nextLine());
                    boolean isEdit = studentService.checkId(optionEdit);
                    String nameEdit = null;
                    int ageEdit = 0;
                    String emailEdit = null;
                    String classesEdit = null;
                    int pointEdit = 0;
                    if (!isEdit) {
                        System.out.println("Không tìm thấy sinh viên này.");
                        break;
                    } else {
                        System.out.println("Nhập nội dung bạn muốn sửa: ");
                        String content = sc.nextLine();
                        switch (content) {
                            case "tên":
                                System.out.print("Nhập tên: ");
                                nameEdit = sc.nextLine();
                                break;
                            case "tuổi":
                                System.out.print("Nhập tuổi: ");
                                ageEdit = Integer.parseInt(sc.nextLine());
                                break;
                            case "email":
                                System.out.print("Nhập email: ");
                                emailEdit = sc.nextLine();
                                break;
                            case "điểm":
                                System.out.print("Nhập điểm: ");
                                pointEdit = Integer.parseInt(sc.nextLine());
                                break;
                            case "lớp":
                                System.out.print("Nhập lớp: ");
                                classesEdit = sc.nextLine();
                                break;
                        }
                        Student1 updateStudent = new Student1(optionEdit, nameEdit, ageEdit, emailEdit, pointEdit, classesEdit);
                        if (studentService.upDate(updateStudent)) {
                            System.out.println("Bạn đã sửa thành công.");
                        } else {
                            System.out.println("Sửa chưa thành công.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Bạn có chắc chắn muốn thoát chương trình? \n" +
                            "1.Có\n" +
                            "2.Không ");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        flag = false;
                    }
            }
        }

        // End program and write data to file
    }
}
