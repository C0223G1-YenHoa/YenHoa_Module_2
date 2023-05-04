package case_study.services;

import case_study.models.Customer;

import case_study.repository.CustomerRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();
    private  final Scanner sc = new Scanner(System.in);
    public  final String ANSI_RESET = "\u001B[0m";
    public  final String ANSI_RED = "\u001B[31m";

    @Override
    public void displayList() {
        List<Customer> customerList = customerRepository.getList();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        String idCustomer;
        do {
            System.out.print("ID:(KH-xxxx) ");
            idCustomer = sc.nextLine();
            try {
                if (!Validate.regexCustomerId(idCustomer)) {
                    throw new Exception("Wrong format input");
                }
                if (customerRepository.checkId(idCustomer)) {
                    throw new Exception("This code already exists");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!Validate.regexCustomerId(idCustomer));
        String name;
        do {
            System.out.print("Name:(Yến Hoa) ");
            name = sc.nextLine();
            try {
                if (!Validate.regexName(name)) {
                    throw new Exception("Wrong format input");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!Validate.regexName(name));
        String dayOfBirth;
        boolean flag = true;
        do {
            System.out.print("Day of birth:(2000-01-10) ");
            dayOfBirth = sc.nextLine();
            LocalDate day = LocalDate.parse(dayOfBirth);
            try {
                if (Validate.regexDay(dayOfBirth) && Validate.regexAge(day) >= 18) {
                    flag = false;
                } else {
                    throw new Exception("Wrong format input and Under 18 years old !");
                }
            } catch (Exception e) {
                e.printStackTrace();
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
            try {
                if (!Validate.regexCitizen(citizenId)) {
                    throw new Exception("Wrong format input");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!Validate.regexCitizen(citizenId));
        String telephone;
        do {
            System.out.print("Telephone number:(10 numbers) ");
            telephone = sc.nextLine();
            try {
                if (!Validate.regexPhone(telephone)) {
                    throw new Exception("Wrong format input");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!Validate.regexPhone(telephone));
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Type guest: \n" +
                "1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member\n" +
                "Enter your choice: ");
        int choose = Integer.parseInt(sc.nextLine());
        EnumCustomerType type = null;
        switch (choose) {
            case 1:
                type = EnumCustomerType.DIAMOND;
                break;
            case 2:
                type = EnumCustomerType.PLATINUM;
                break;
            case 3:
                type = EnumCustomerType.GOLD;
                break;
            case 4:
                type = EnumCustomerType.SLIVER;
                break;
            case 5:
                type = EnumCustomerType.MEMBER;
                break;
        }
        System.out.println("Address: \n");
        String address = sc.nextLine();
        Customer newCustomer = new Customer(idCustomer, name, dayOfBirth, gender, citizenId, telephone, email, type, address);
        customerRepository.addCustomer(newCustomer);
    }

    @Override
    public boolean checkId(String id) {
        return customerRepository.checkId(id);
    }

    @Override
    public void editCustomer(String id) {
        Customer updateCustomer = customerRepository.findId(id);
        boolean isFag = true;
        do {
            System.out.print("Enter the content you want to update: \n" +
                    "1. Name\n" +
                    "2. Day of birth\n" +
                    "3. Gender\n" +
                    "4. Citizen ID\n" +
                    "5. Telephone Number\n" +
                    "6. Email\n" +
                    "7. Type Guest\n" +
                    "8. Address\n" +
                    "9. Exit\n" +
                    "Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            String newDay;
            String newName;
            String updateGender;
            String newCitizenId;
            String newTelephone;
            String newEmail;
            EnumCustomerType updateType = null;
            String updateAddress;
            switch (choice) {
                case 1:
                    do {
                        System.out.print("New name:(Yến Hoa) ");
                        newName = sc.nextLine();
                        if (!Validate.regexName(newName)) {
                            System.out.println("Wrong format input");
                        }
                    } while (!Validate.regexName(newName));
                    updateCustomer.setName(newName);
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
                    updateCustomer.setDayOfBirth(newDay);
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
                    updateCustomer.setGender(updateGender);
                    break;
                case 4:
                    do {
                        System.out.print("Citizen ID:(9-12 numbers) ");
                        newCitizenId = sc.nextLine();
                        if (!Validate.regexCitizen(newCitizenId)) {
                            System.out.println("Wrong format input");
                        }
                    } while (!Validate.regexCitizen(newCitizenId));
                    updateCustomer.setCitizenId(newCitizenId);
                    break;
                case 5:
                    do {
                        System.out.print("Telephone Number:(10 numbers) ");
                        newTelephone = sc.nextLine();
                        if (!Validate.regexPhone(newTelephone)) {
                            System.out.println("Wrong format input");
                        }
                    } while (!Validate.regexPhone(newTelephone));
                    updateCustomer.setTelephoneNumber(newTelephone);
                    break;
                case 6:
                    System.out.print("Email: ");
                    newEmail = sc.nextLine();
                    updateCustomer.setEmail(newEmail);
                    break;
                case 7:
                    System.out.print("Type guest: \n" +
                            "1. Diamond\n" +
                            "2. Platinum\n" +
                            "3. Gold\n" +
                            "4. Silver\n" +
                            "5. Member\n" +
                            "Enter your choice: ");
                    int newChoose = Integer.parseInt(sc.nextLine());
                    switch (newChoose) {
                        case 1:
                            updateType = EnumCustomerType.DIAMOND;
                            break;
                        case 2:
                            updateType = EnumCustomerType.PLATINUM;
                            break;
                        case 3:
                            updateType = EnumCustomerType.GOLD;
                            break;
                        case 4:
                            updateType = EnumCustomerType.SLIVER;
                            break;
                        case 5:
                            updateType = EnumCustomerType.MEMBER;
                            break;
                    }
                    updateCustomer.setTypeGuest(updateType);
                    break;
                case 8:
                    System.out.println("Address: \n" +
                            "Enter your choice: ");
                    updateAddress = sc.nextLine();
                    updateCustomer.setAddress(updateAddress);
                    break;
                case 9:
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
            customerRepository.editCustomer(updateCustomer);
        } while (isFag);
    }
}

