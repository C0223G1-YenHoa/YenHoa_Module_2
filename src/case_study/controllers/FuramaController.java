package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner sc = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";


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
                if (choice < 0 || choice > 4) {
                    throw new Exception("Enter only numbers from 1 to 6");
                }
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                String y = "\uD83C\uDD98";
                System.out.println( y ) ;
            } catch (Exception e) {
                System.err.println(e);
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
                            System.err.println(e);
                        }
                        switch (choiceEmployee) {
                            case 1:
                                //Display list employees
                                break;
                            case 2:
                                //Add new employee
                                break;
                            case 3:
                                //Edit employee
                                break;
                            case 4:
                                //Return main menu
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
                            System.err.println(e);
                        }
                        switch (choiceCustomer) {
                            case 1:
                                //Display list customer
                                break;
                            case 2:
                                //Add new customer
                                break;
                            case 3:
                                //Edit customer
                                break;
                            case 4:
                                //Return main menu
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
                            System.err.println(e);
                        }
                        switch (choiceFacility) {
                            case 1:
                                //Display list facility
                                break;
                            case 2:
                                //Add new facility
                                break;
                            case 3:
                                //Edit facility
                                break;
                            case 4:
                                //Return main menu
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
                                "4. Display list contracts" +
                                "5. Edit contracts\n" +
                                "6. Return main menu\n" +
                                "Enter your choice: ");
                        int choiceBooking = -4;
                        try {
                            choiceBooking = Integer.parseInt(sc.nextLine());
                            if (choiceBooking < 0 || choiceBooking > 6) {
                                throw new Exception("Enter only numbers from 1 to 4");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                        switch (choiceBooking) {
                            case 1:
                                //Add new booking
                                break;
                            case 2:
                                //Display list booking
                                break;
                            case 3:
                                //Create new contracts
                                break;
                            case 4:
                                //Edit contracts
                                break;
                            case 5:
                                //Return main menu
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
                            if (choicePromotion < 0 || choicePromotion > 4) {
                                throw new Exception("Enter only numbers from 1 to 4");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                        } catch (Exception e) {
                            System.err.println(e);
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
                                break;
                        }
                    } while (flag5);
                    break;
                case 6:
                    System.out.println("Do you want exit the app?" +
                            "1. Yes\n" +
                            "2. No");
                    int choiceExit = -6;
                    try {
                        choiceExit = Integer.parseInt(sc.nextLine());
                        if (choiceExit < 0 || choiceExit > 4) {
                            throw new Exception("Enter only numbers from 1 to 4");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Enter only number" + ANSI_RESET);
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    if (choiceExit == 1) {
                        System.out.println("Successful Exit");
                        flag = false;
                    }
                    break;
            }
        } while (flag);
    }
}
