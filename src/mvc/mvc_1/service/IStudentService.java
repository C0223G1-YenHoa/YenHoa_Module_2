package mvc.mvc_1.service;

import mvc.mvc_1.model.Student1;

import java.util.ArrayList;

public interface IStudentService {
     void displayList();
     void add(Student1 student1);
     boolean checkId(int id);
     boolean delete(int id);
     boolean upDate(Student1 updateStudent);
     void addAll(ArrayList<Student1> studentListAddData);
}
