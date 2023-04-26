package case_study.view;

import case_study.controllers.FuramaController;
import case_study.models.Employee;

public class FuramaView {
    public static void main(String[] args) {
        FuramaController furamaController=new FuramaController();
        furamaController.displayMainMenu();
        Employee employee=new Employee(1,"hoa","fff",true,4,4,"fff","fff","fff",777);

    }
}
