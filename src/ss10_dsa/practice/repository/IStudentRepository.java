package ss10_dsa.practice.repository;

import ss10_dsa.practice.model.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> getStudentList();

    void add(Student student);

    boolean deleteStudentByID(int id);
}
