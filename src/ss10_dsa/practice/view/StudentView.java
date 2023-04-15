package ss10_dsa.practice.view;

import ss10_dsa.practice.controller.StudentController;

public class StudentView {

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.menu();
    }

}
