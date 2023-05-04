package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.repository.ContractRepository;

import java.util.Scanner;

public class ContractsService implements IContractsService {
    private final Scanner sc = new Scanner(System.in);
    private ContractRepository contractRepo = new ContractRepository();


    @Override
    public void createContract() {
        if (contractRepo.getBookingQueue().peek().getServiceCode().contains("RO")) {
            System.out.println("Room rental service doesn't need to create a contract.");
            contractRepo.getBookingQueue().remove();
        } else {
            String bookingCode = contractRepo.getBookingQueue().poll().getBookingId();
            System.out.print("Enter Deposit: ");
            double deposit = Double.parseDouble(sc.nextLine());
            System.out.print("Enter Total Paymen: ");
            double payment = Double.parseDouble(sc.nextLine());
            Contract contract = new Contract(bookingCode, deposit, payment);
            contractRepo.createContract(contract);
        }

    }

    @Override
    public void displayContracts() {
        for (Contract c : contractRepo.getListContract()) {
            System.out.println(c);
        }
    }

    @Override
    public void editContract(String bookingCode) {
//        displayContracts();
//        System.out.println("Enter Booking Code: ");
//        String bookingCode=sc.nextLine();
//        int contractID;
        Contract editContract= contractRepo.findContract(bookingCode);
        boolean flag=true;
        do {
            System.out.print("Enter the content you want to edit: \n" +
                    "1. Deposit\n" +
                    "2. Total payment\n" +
                    "3. Exit\n" +
                    "Enter your choice: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 3) {
                    throw new Exception("Enter only number from 1 to 3.");
                }
            } catch (NumberFormatException e) {
                System.err.print("Enter only numbers");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(choice==1){
                System.out.print("Enter new deposit: ");
                double newDeposit=Double.parseDouble(sc.nextLine());
                editContract.setDeposit(newDeposit);
            }else if (choice==2){
                System.out.print("Enter new total payment: ");
                double newPayment=Double.parseDouble(sc.nextLine());
                editContract.setPayment(newPayment);
            } else {
                System.out.print("Do you want to exit Edit Contract?\n" +
                        "1.Yes\n" +
                        "2.No\n" +
                        "Enter your choice: ");
                int choose=0;
                try{
                    choose=Integer.parseInt(sc.nextLine());
                    if(choose<0||choose>2){
                        throw new Exception("Enter only number from 1 to 2.");
                    }
                }catch (NumberFormatException e){
                    System.err.println("Wrong format input");
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                if(choose==1){
                    flag=false;
                    System.out.println("Successful Exit");
                }
            }
        }while (flag);
        contractRepo.editContract(editContract);
    }

    @Override
    public boolean isCheck(String bookingCode) {
        return contractRepo.checkBookingCode(bookingCode);
    }
}
