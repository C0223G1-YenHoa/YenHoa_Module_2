package ss10_dsa.practice.service;

import ss10_dsa.practice.model.Student;
import ss10_dsa.practice.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private static final StudentRepository studentRepository = new StudentRepository();

    @Override
    public void getStudentList() {
        ArrayList<Student> studentList = studentRepository.getStudentList();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void add() {
        System.out.println("Nhập mã học viên: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên học viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("Nhập lớp: ");
        String classes = sc.nextLine();
        System.out.println("Nhập điểm: ");
        int point = Integer.parseInt(sc.nextLine());
        Student student = new Student(id, name, dayOfBirth, gender, classes, point);
        studentRepository.add(student);
    }

    @Override
    public void delete() {
        this.getStudentList();
        System.out.print("Nhập ID sinh viên mà bạn muốn xóa: ");
        int choice = Integer.parseInt(sc.nextLine());
        boolean isDeleted = studentRepository.deleteStudentByID(choice);
        if (isDeleted) {
            System.out.println("Bạn đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy.");
        }
    }
}


