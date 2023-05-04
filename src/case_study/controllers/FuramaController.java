package case_study.controllers;

import case_study.models.Booking;
import case_study.services.*;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner sc = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    private final EmployeeService employeeService = new EmployeeService();
    private final CustomerService customerService = new CustomerService();
    private final FacilityService facilityService = new FacilityService();
    private final BookingService bookingService= new BookingService();
    private final ContractsService contractsService=new ContractsService();


    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.print("----FURAMA RESORT----\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit \n" +
                    "Enter your choice: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 6) {
                    throw new Exception(ANSI_RED + "Enter only numbers from 1 to 6" + ANSI_RESET);
                }
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                String y = "\uD83C\uDD98";
                System.out.println(y);
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (choice) {
                case 1:
                    boolean flag1 = true;
                    do {
                        System.out.print("----EMPLOYEE MANAGEMENT----\n" +
                                "1. Display list employees\n" +
                                "2. Add new employee\n" +
                                "3. Edit employee\n" +
                                "4. Return main menu\n" +
                                "Enter your choice: ");
                        int choiceEmployee = -1;
                        try {
                            choiceEmployee = Integer.parseInt(sc.nextLine());
                            if (choiceEmployee < 0 || choiceEmployee > 4) {
                                throw new Exception("Enter only numbers from 1 to 4");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (choiceEmployee) {
                            case 1:
                                employeeService.displayList();
                                break;
                            case 2:
                                employeeService.addEmployee();
                                break;
                            case 3:
                                //Edit employee
                                System.out.print("Enter the employee ID you want to edit: ");
                                String idUpdate = sc.nextLine();
                                boolean isEdit = employeeService.checkId(idUpdate);
                                if (!isEdit) {
                                    System.out.println("Not found");
                                } else {
                                    employeeService.editEmployee(idUpdate);
                                }
                                break;
                            case 4:
                                System.out.println("Do you want exit Employee Management?\n" +
                                        "1. Yes\n" +
                                        "2. No \n" +
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
                                    e.printStackTrace();
                                }
                                if (choiceExit == 1) {
                                    System.out.println("Successful Exit");
                                    flag1 = false;
                                }
                                break;
                        }
                    } while (flag1);
                    break;
                case 2:
                    boolean flag2 = true;
                    do {
                        System.out.print("----CUSTOMER MANAGEMENT----\n" +
                                "1. Display list customer\n" +
                                "2. Add new customer\n" +
                                "3. Edit customer\n" +
                                "4. Return main menu\n" +
                                "Enter your choice: ");
                        int choiceCustomer = -2;
                        try {
                            choiceCustomer = Integer.parseInt(sc.nextLine());
                            if (choiceCustomer < 0 || choiceCustomer > 4) {
                                throw new Exception("Enter only numbers from 1 to 4");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (choiceCustomer) {
                            case 1:
                                customerService.displayList();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                System.out.print("Enter the customer ID you want to edit: ");
                                String idUpdate = sc.nextLine();
                                boolean isEdit = customerService.checkId(idUpdate);
                                if (!isEdit) {
                                    System.out.println("Not found");
                                } else {
                                    customerService.editCustomer(idUpdate);
                                }
                                break;
                            case 4:
                                System.out.println("Do you want exit Customer Management?\n" +
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
                                    e.printStackTrace();
                                }
                                if (choiceExit == 1) {
                                    System.out.println("Successful Exit");
                                    flag2 = false;
                                }
                                break;
                        }
                    } while (flag2);
                    break;
                case 3:
                    boolean flag3 = true;
                    do {
                        System.out.print("----FACILITY MANAGEMENT----\n" +
                                "1. Display list facility\n" +
                                "2. Add new facility\n" +
                                "3. Display list facility maintenance\n" +
                                "4. Return main menu\n" +
                                "Enter your choice: ");
                        int choiceFacility = -3;
                        try {
                            choiceFacility = Integer.parseInt(sc.nextLine());
                            if (choiceFacility < 0 || choiceFacility > 4) {
                                throw new Exception("Enter only numbers from 1 to 4");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (choiceFacility) {
                            case 1:
                                //Display list facility
                                boolean flagIs = true;
                                do {
                                    System.out.print("----DISPLAY LIST FACILITY----\n" +
                                            "1. Display list all\n" +
                                            "2. Display list villa\n" +
                                            "3. Display list house\n" +
                                            "4. Display list room\n" +
                                            "5. Exit\n" +
                                            "Enter your choice: ");
                                    int option=0;
                                    try {
                                         option = Integer.parseInt(sc.nextLine());
                                        if(option<0 ||option>5){
                                            throw new Exception("Enter only numbers from 1 to 2:");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    switch (option) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                            //display villa
                                            facilityService.display(option);
                                            break;
                                        case 5:
                                            System.out.println("Do you want exit Display List Facility?\n" +
                                                    "1. Yes\n" +
                                                    "2. No\n" +
                                                    "Enter your choice: ");
                                            int exit = 0;
                                            try {
                                                exit = Integer.parseInt(sc.nextLine());
                                                if (exit < 0 || exit > 2) {
                                                    throw new Exception("Enter only numbers from 1 to 2: ");
                                                }
                                            } catch (NumberFormatException e) {
                                                System.out.println(ANSI_RED + "Enter only numbers" + ANSI_RESET);
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            if (exit == 1) {
                                                System.out.println("Successful Exit !");
                                                flagIs = false;
                                            }
                                    }
                                } while (flagIs);
                                break;
                            case 2:
                                //Add new facility
                                boolean isFlag = true;
                                do {
                                    System.out.print("----ADD NEW FACILITY----\n" +
                                            "1. Add New Villa\n" +
                                            "2. Add New House\n" +
                                            "3. Add New Room\n" +
                                            "4. Back to menu\n " +
                                            "Enter your choice: ");
                                    int choice2 =0;
                                    try {
                                        choice2 = Integer.parseInt(sc.nextLine());
                                        if(choice2<0||choice2>4){
                                            throw new Exception("Enter only numbers from 1 to 4");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println(ANSI_RED + "Enter only numbers" + ANSI_RESET);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    switch (choice2) {
                                        case 1:
                                        case 2:
                                        case 3:
                                            facilityService.addFacility(choice2);
                                            break;
                                        case 4:
                                            System.out.println("Do you want exit Customer Management?\n" +
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
                                                e.printStackTrace();
                                            }
                                            if (choiceExit == 1) {
                                                System.out.println("Successful Exit");
                                                isFlag = false;
                                            }
                                    }
                                } while (isFlag);
                                break;
                            case 3:
                                //	Display list facility maintenance
                                System.out.println("----FACILITY MAINTENANCE----");
                                facilityService.displayMaintenance();
                                break;
                            case 4:
                                //Return main menu
                                System.out.println("Do you want exit Employee Management?\n" +
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
                                    e.printStackTrace();
                                }
                                if (choiceExit == 1) {
                                    System.out.println("Successful Exit");
                                    flag3 = false;
                                }
                                break;
                        }
                    } while (flag3);
                    break;
                case 4:
                    boolean flag4 = true;
                    do {
                        System.out.print("----BOOKING MANAGEMENT----\n" +
                                "1. Add new booking\n" +
                                "2. Display list booking \n" +
                                "3. Create new contracts\n" +
                                "4. Display list contracts\n" +
                                "5. Edit contracts\n" +
                                "6. Return main menu\n" +
                                "Enter your choice: ");
                        int choiceBooking = -4;
                        try {
                            choiceBooking = Integer.parseInt(sc.nextLine());
                            if (choiceBooking < 0 || choiceBooking > 6) {
                                throw new Exception("Enter only numbers from 1 to 6");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (choiceBooking) {
                            case 1:
                                //Add new booking
                                System.out.println("----NEW BOOKING----");
                                bookingService.addBooking();
                                break;
                            case 2:
                                //Display list booking
                                System.out.println("----BOOKING----");
                                bookingService.displayListBooking();
                                break;
                            case 3:
                                //Create new contracts
                                System.out.println("----CREATE NEW CONTRACT----");
                                contractsService.createContract();
                                break;
                            case 4:
                                //Display contract list
                                System.out.println("----CONTRACT----");
                                contractsService.displayContracts();
                                break;
                            case 5:
                                System.out.println("----EDIT CONTRACT----");
                                contractsService.displayContracts();
                                System.out.println("Enter Booking Code: ");
                                String bookingCode=sc.nextLine();
                                if (!contractsService.isCheck(bookingCode)){
                                    System.out.println("Not found.");
                                } else{
                                    contractsService.editContract(bookingCode);
                                }
                                //Edit contracts
                                break;
                            case 6:
                                //Return main menu
                                System.out.println("Do you want exit Employee Management?\n" +
                                        "1. Yes\n" +
                                        "2. No\n" +
                                        "Enter your choice: ");
                                int choiceExit = -6;
                                try {
                                    choiceExit = Integer.parseInt(sc.nextLine());
                                    if (choiceExit < 0 || choiceExit > 2) {
                                        throw new Exception("Enter only numbers from 1 to 2" );
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                if (choiceExit == 1) {
                                    System.out.println("Successful Exit");
                                    flag4 = false;
                                }
                                break;
                        }
                    } while (flag4);
                    break;
                case 5:
                    boolean flag5 = true;
                    do {
                        System.out.print("----PROMOTION MANAGEMENT----\n" +
                                "1. Display list customers use service\n" +
                                "2. Display list customers get voucher\n" +
                                "3. Return main menu\n" +
                                "Enter your choice: ");
                        int choicePromotion = -5;
                        try {
                            choicePromotion = Integer.parseInt(sc.nextLine());
                            if (choicePromotion < 0 || choicePromotion > 3) {
                                throw new Exception("Enter only numbers from 1 to 3");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (choicePromotion) {
                            case 1:
                                //Display list customers use service
                                break;
                            case 2:
                                //Display list customers get voucher
                                break;
                            case 3:
                                //Return main menu
                                System.out.println("Do you want exit Employee Management?\n" +
                                        "1. Yes\n" +
                                        "2. No\n" +
                                        "Enter your choice: ");
                                int choiceExit = -6;
                                try {
                                    choiceExit = Integer.parseInt(sc.nextLine());
                                    if (choiceExit < 0 || choiceExit > 3) {
                                        throw new Exception("Enter only numbers from 1 to 2");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                if (choiceExit == 1) {
                                    System.out.println("Successful Exit");
                                    flag5 = false;
                                }
                                break;
                        }
                    } while (flag5);
                    break;
                case 6:
                    System.out.println("Do you want exit the app?\n" +
                            "1. Yes\n" +
                            "2. No\n" +
                            "Enter your choice: ");
                    int choiceExit = Integer.parseInt(sc.nextLine());
                    if (choiceExit == 1) {
                        System.out.println("Successful Exit");
                        flag = false;
                    }
                    break;
            }
        } while (flag);
    }
}
