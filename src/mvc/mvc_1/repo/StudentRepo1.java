package mvc.mvc_1.repo;

import mvc.mvc_1.common.ReadAndWriteFile;
import mvc.mvc_1.model.Student1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo1 implements IStudentRepo1 {
    private static final List<Student1> studentList = ReadAndWriteFile.readFile();

    static {
        Student1 student1= new Student1(1, "f", 1, "d", 2, "r");
        ReadAndWriteFile.writeFile(student1,true);
    }

    @Override
    public ArrayList<Student1> getList() {
        return ReadAndWriteFile.readFile();
    }

    @Override
    public void add(Student1 student1) {
        ReadAndWriteFile.writeFile(student1, true);
    }

    @Override
    public boolean checkId(int id) {
        boolean isFlag = false;
        for (Student1 s : studentList) {
            if (s.getId() == id) {
                isFlag = true;
                break;
            }
        }
        return isFlag;
    }


    @Override
    public boolean deleteStudent(int id) {
        for (Student1 s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean upDate(Student1 updateStudent) {
        for (Student1 s : studentList) {
            if (s.getId() == updateStudent.getId()) {
                if (updateStudent.getName() != null) {
                    s.setName(updateStudent.getName());
                }
                if (updateStudent.getAge() != 0) {
                    s.setAge(updateStudent.getAge());
                }
                if (updateStudent.getEmail() != null) {
                    s.setEmail(updateStudent.getEmail());
                }
                if (updateStudent.getPoint() != 0) {
                    s.setPoint(updateStudent.getPoint());
                }
                if (updateStudent.getClasses() != null) {
                    s.setClasses(updateStudent.getClasses());
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void addAll(ArrayList<Student1> studentListAddData) {
        studentList.addAll(studentListAddData);
        System.out.println(studentList.size());
    }
}
