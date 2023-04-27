package mvc.mvc_1.view;

import mvc.mvc_1.common.ReadAndWriteFile;
import mvc.mvc_1.controller.StudentController;
import mvc.mvc_1.model.Student1;
import ss17_io_binary_file_serialization.product_management.common.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentView {
    public static void main(String[] args) throws IOException {
        StudentController studentController=new StudentController();
        studentController.showList();
//        Student1 student1=new Student1(1,"Hoa",23,"hgfdvd",9,"fgfgfg");
//        ReadAndWriteFile.writeFile(student1,true);
////        List<Student1> list=ReadAndWriteFile.readFile();
////        for (Student1 s:list) {
////            System.out.println(s);
////        }
//        ReadAndWriteFile.writeFile(student1,false);
//        System.out.println(ReadAndWriteFile.readFile());
    }
}
