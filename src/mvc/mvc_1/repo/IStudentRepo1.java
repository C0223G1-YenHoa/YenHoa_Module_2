package mvc.mvc_1.repo;

import mvc.mvc_1.model.Student1;

import java.util.ArrayList;

public interface IStudentRepo1 {
    ArrayList<Student1> getList();

    void add(Student1 student1);

    boolean checkId(int id);

    boolean deleteStudent(int id);

    boolean upDate(Student1 student1);

    void addAll(ArrayList<Student1>studentList);

}

