package ss10_dsa.practice.repository;

import ss10_dsa.practice.model.Student;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {

    private static final ArrayList<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Hoa", "2000", "Nữ", "C0223G1", 10));
        studentList.add(new Student(2, "Hưng", "1998", "Nam", "C0223G1", 10));
        studentList.add(new Student(3, "Thái", "1996", "Nam", "C0223G1", 10));
        studentList.add(new Student(4, "Kiệt", "1996", "Nam", "C0223G1", 10));
    }

    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean deleteStudentByID(int id) {
        boolean flag = true;
        for (Student s : studentList) {
            if (Objects.equals(s.getId(), id)) {
                System.out.println("Bạn có chắc muốn xóa học viên " + s.getName() + "?: \n" +
                        "1. Có \n" +
                        "2. Không");
                Scanner sc = new Scanner(System.in);
                int choose = Integer.parseInt(sc.nextLine());
                if (choose == 1) {
                    studentList.remove(s);
                } else
                    flag = false;
                break;
            } else
                flag = false;
        }
        return flag;
    }

    @Override
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}

