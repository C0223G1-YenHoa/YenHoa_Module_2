package case_study.services;

import case_study.models.Contract;
import case_study.repository.ContractRepository;

import java.util.Scanner;

public class ContractsService implements IContractsService {
    private final Scanner sc = new Scanner(System.in);
    private final ContractRepository contractRepo = new ContractRepository();


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
        contractRepo.editContract(bookingCode);
    }

    @Override
    public boolean isCheck(String bookingCode) {
        return contractRepo.checkBookingCode(bookingCode);
    }
}
