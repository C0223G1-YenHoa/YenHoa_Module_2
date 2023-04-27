package mvc.mvc_1.service;

import mvc.mvc_1.model.Student1;
import mvc.mvc_1.repo.StudentRepo1;

import java.util.ArrayList;

public class StudentService implements IStudentService {
    private final StudentRepo1 studentRepo1 = new StudentRepo1();

    @Override
    public void displayList() {
        ArrayList<Student1> list = studentRepo1.getList();
        for (Student1 s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void add(Student1 student1) {
        studentRepo1.add(student1);
    }

    @Override
    public boolean checkId(int id) {
        return studentRepo1.checkId(id);
    }

    @Override
    public boolean delete(int id) {
        return studentRepo1.deleteStudent(id);

    }

    @Override
    public boolean upDate(Student1 updateStudent) {
        return studentRepo1.upDate(updateStudent);
    }

    @Override
    public void addAll(ArrayList<Student1> studentListAddData) {
        studentRepo1.addAll(studentListAddData);
    }


}
