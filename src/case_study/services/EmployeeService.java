package case_study.services;

import case_study.models.Employee;
import case_study.repository.EmployeeRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private  final Scanner sc = new Scanner(System.in);
    public  final String ANSI_RESET = "\u001B[0m";
    public  final String ANSI_RED = "\u001B[31m";
    private final EmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public void displayList() {
        List<Employee> employeeList = employeeRepository.getList();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
        String id;
        do {
            System.out.print("ID:(NV-xxxx) ");
            id = sc.nextLine();
            if (!Validate.regexId(id)) {
                System.out.println("Wrong format input");
            }
        } while (!Validate.regexId(id));
        String name;
        do {
            System.out.print("Name:(Yen Hoa) ");
            name = sc.nextLine();
            if (!Validate.regexName(name)) {
                System.out.println("Wrong format input");
            }
        } while (!Validate.regexName(name));
        String dayOfBirth;
        boolean flag = true;
        do {
            System.out.print("Day of birth:(2000-01-10) ");
            dayOfBirth = sc.nextLine();
            LocalDate day = LocalDate.parse(dayOfBirth);
            if (Validate.regexDay(dayOfBirth) && Validate.regexAge(day) >= 18) {
                flag = false;
            } else {
                System.out.println("Wrong format input and Under 18 years old !");
            }
        } while (flag);
        System.out.print("Gender: \n" +
                "1. Female\n" +
                "2. Male\n" +
                "Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        String gender;
        if (choice == 1) {
            gender = "Female";
        } else {
            gender = "Male";
        }
        String citizenId;
        do {
            System.out.print("Citizen ID:(9-12 numbers) ");
            citizenId = sc.nextLine();
            if (!Validate.regexCitizen(citizenId)) {
                System.out.println("Wrong format input");
            }
        } while (!Validate.regexCitizen(citizenId));
        String telephone;
        do {
            System.out.print("Telephone number:(10 numbers) ");
            telephone = sc.nextLine();
            if (!Validate.regexPhone(telephone)) {
                System.out.println("Wrong format input");
            }
        } while (!Validate.regexPhone(telephone));
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Grade: \n" +
                "1. Intermediate\n" +
                "2. College\n" +
                "3. University\n" +
                "4. After University\n" +
                "Enter your choice: ");
        int choose = Integer.parseInt(sc.nextLine());
        EnumEmployeeGrade grade = null;
        switch (choose) {
            case 1:
                grade = EnumEmployeeGrade.INTERMEDIATE;
                break;
            case 2:
                grade = EnumEmployeeGrade.COLLEGE;
                break;
            case 3:
                grade = EnumEmployeeGrade.UNIVERSITY;
                break;
            case 4:
                grade = EnumEmployeeGrade.AFTER_UNIVERSITY;
                break;
        }
        System.out.println("Position: \n" +
                "1. Receptionist\n" +
                "2. Server\n" +
                "3. Expert\n" +
                "4. Monitor\n" +
                "5. Manager\n" +
                "6. Administrator\n" +
                "Enter your choice: ");
        int option = Integer.parseInt(sc.nextLine());
        EnumEmployeePosition position = null;
        switch (option) {
            case 1:
                position = EnumEmployeePosition.RECEPTIONIST;
                break;
            case 2:
                position = EnumEmployeePosition.SERVER;
                break;
            case 3:
                position = EnumEmployeePosition.EXPERT;
                break;
            case 4:
                position = EnumEmployeePosition.MONITOR;
                break;
            case 5:
                position = EnumEmployeePosition.MANAGER;
                break;
            case 6:
                position = EnumEmployeePosition.ADMINISTRATOR;
                break;
        }
        double salary;
        do {
            System.out.println("Salary: ");
            salary = Double.parseDouble(sc.nextLine());
        } while (salary < 0);
        Employee newEmployee = new Employee(id, name, dayOfBirth, gender, citizenId, telephone, email, grade, position, salary);
        employeeRepository.addEmployee(newEmployee);
    }

    @Override
    public boolean checkId(String id) {
        return employeeRepository.checkId(id);
    }

    @Override
    public void editEmployee(String id) {
        Employee updateEmployee = employeeRepository.findId(id);
        boolean isFag = true;
        do {
            System.out.print("Enter the content you want to update: \n" +
                    "1. Name\n" +
                    "2. Day of birth\n" +
                    "3. Gender\n" +
                    "4. Citizen ID\n" +
                    "5. Telephone Number\n" +
                    "6. Email\n" +
                    "7. Grade\n" +
                    "8. Position\n" +
                    "9. Salary\n" +
                    "10.Exit\n" +
                    "Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            String newDay;
            String newName;
            String updateGender;
            String newCitizenId;
            String newTelephone;
            String newEmail;
            EnumEmployeeGrade updateGrade = null;
            double newSalary;
            EnumEmployeePosition updatePosition = null;
            switch (choice) {
                case 1:
                    do {
                        System.out.print("New name:(Yen Hoa) ");
                        newName = sc.nextLine();
                        if (!Validate.regexName(newName)) {
                            System.out.println("Wrong format input");
                        }
                    } while (!Validate.regexName(newName));
                    updateEmployee.setName(newName);
                    break;
                case 2:
                    boolean flag = true;
                    do {
                        System.out.print("New Day of birth:(2000-01-10) ");
                        newDay = sc.nextLine();
                        LocalDate day = LocalDate.parse(newDay);
                        if (Validate.regexDay(newDay) && Validate.regexAge(day) >= 18) {
                            System.out.println("Successful !");
                            flag = false;
                        } else {
                            System.out.println("Wrong format input and Under 18 years old !");
                        }
                    } while (flag);
                    updateEmployee.setDayOfBirth(newDay);
                    break;
                case 3:
                    System.out.print("Gender: \n" +
                            "1. Female\n" +
                            "2. Male\n" +
                            "Enter your choice: ");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        updateGender = "Female";
                    } else {
                        updateGender = "Male";
                    }
                    updateEmployee.setGender(updateGender);
                    break;
                case 4:
                    do {
                        System.out.print("Citizen ID:(9-12 numbers) ");
                        newCitizenId = sc.nextLine();
                        if (!Validate.regexCitizen(newCitizenId)) {
                            System.out.println("Wrong format input");
                        }
                    } while (!Validate.regexCitizen(newCitizenId));
                    updateEmployee.setCitizenId(newCitizenId);
                    break;
                case 5:
                    do {
                        System.out.print("Telephone Number:(10 numbers) ");
                        newTelephone = sc.nextLine();
                        if (!Validate.regexPhone(newTelephone)) {
                            System.out.println("Wrong format input");
                        }
                    } while (!Validate.regexPhone(newTelephone));
                    updateEmployee.setTelephoneNumber(newTelephone);
                    break;
                case 6:
                    System.out.print("Email: ");
                    newEmail = sc.nextLine();
                    updateEmployee.setEmail(newEmail);
                    break;
                case 7:
                    System.out.print("Grade: \n" +
                            "1. Intermediate\n" +
                            "2. College\n" +
                            "3. University\n" +
                            "4. After University\n" +
                            "Enter your choice: ");
                    int newChoose = Integer.parseInt(sc.nextLine());
                    switch (newChoose) {
                        case 1:
                            updateGrade = EnumEmployeeGrade.INTERMEDIATE;
                            break;
                        case 2:
                            updateGrade = EnumEmployeeGrade.COLLEGE;
                            break;
                        case 3:
                            updateGrade = EnumEmployeeGrade.UNIVERSITY;
                            break;
                        case 4:
                            updateGrade = EnumEmployeeGrade.AFTER_UNIVERSITY;
                            break;
                    }
                    updateEmployee.setGrade(updateGrade);
                    break;
                case 8:
                    System.out.print("Position: \n" +
                            "1. Receptionist\n" +
                            "2. Server\n" +
                            "3. Expert\n" +
                            "4. Monitor\n" +
                            "5. Manager\n" +
                            "6. Administrator\n" +
                            "Enter your choice: ");
                    int newOption = Integer.parseInt(sc.nextLine());
                    switch (newOption) {
                        case 1:
                            updatePosition = EnumEmployeePosition.RECEPTIONIST;
                            break;
                        case 2:
                            updatePosition = EnumEmployeePosition.SERVER;
                            break;
                        case 3:
                            updatePosition = EnumEmployeePosition.EXPERT;
                            break;
                        case 4:
                            updatePosition = EnumEmployeePosition.MONITOR;
                            break;
                        case 5:
                            updatePosition = EnumEmployeePosition.MANAGER;
                            break;
                        case 6:
                            updatePosition = EnumEmployeePosition.ADMINISTRATOR;
                            break;
                    }
                    updateEmployee.setPosition(updatePosition);
                    break;
                case 9:
                    System.out.print("Salary: ");
                    newSalary = Double.parseDouble(sc.nextLine());
                    updateEmployee.setSalary(newSalary);
                    break;
                case 10:
                    System.out.print("Do you want exit the app?\n" +
                            "1. Yes\n" +
                            "2. No\n" +
                            "Enter your choice: ");
                    int choiceExit = -6;
                    try {
                        choiceExit = Integer.parseInt(sc.nextLine());
                        if (choiceExit < 0 || choiceExit > 2) {
                            throw new Exception("Enter only numbers from 1 to 2");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    if (choiceExit == 1) {
                        System.out.println("Successful Exit");
                        isFag = false;
                    }
                    break;
            }
            employeeRepository.editEmployee(updateEmployee);
        } while (isFag);
    }
}

