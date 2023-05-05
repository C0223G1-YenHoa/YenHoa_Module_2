package case_study.repository;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.*;

public class ContractRepository implements IContractRepository {
    private static Queue<Booking> bookingQueue = new ArrayDeque<>();
    private Queue<Contract> contractList = new ArrayDeque<>();
    private static final BookingRepository bookingRepository = new BookingRepository();
    private final Scanner sc = new Scanner(System.in);

    static {
        Set<Booking> bookingSet = bookingRepository.displayBookingList();
        List<Booking> bookingList = new ArrayList<>();
        for (Booking b : bookingSet) {
            bookingList.add(b);
        }
        Collections.sort(bookingList, new BookingComparator());
        for (Booking b : bookingList) {
            bookingQueue.offer(b);
        }
    }

    @Override
    public void createContract(Contract contract) {
        contractList.add(contract);
    }

    @Override
    public Queue<Contract> getListContract() {
        return contractList;
    }

    @Override
    public Queue<Booking> getBookingQueue() {
        return bookingQueue;
    }

    @Override
    public void editContract(String code) {
        Contract editContract = findContract(code);
        boolean flag = true;
        do {
            System.out.print("Enter the content you want to edit: \n" +
                    "1. Deposit\n" +
                    "2. Total payment\n" +
                    "3. Booking Code\n" +
                    "4. Exit\n" +
                    "Enter your choice: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 4) {
                    throw new Exception("Enter only number from 1 to 4.");
                }
            } catch (NumberFormatException e) {
                System.err.print("Enter only numbers");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (choice == 1) {
                System.out.print("Enter new deposit: ");
                double newDeposit = Double.parseDouble(sc.nextLine());
                editContract.setDeposit(newDeposit);
            } else if (choice == 2) {
                System.out.print("Enter new total payment: ");
                double newPayment = Double.parseDouble(sc.nextLine());
                editContract.setPayment(newPayment);
            } else if (choice == 3) {
                System.out.print("Enter new booking code: ");
                String newCode = sc.nextLine();
                editContract.setBookingCode(newCode);
            } else {
                System.out.print("Do you want to exit Edit Contract?\n" +
                        "1.Yes\n" +
                        "2.No\n" +
                        "Enter your choice: ");
                int choose = 0;
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 0 || choose > 2) {
                        throw new Exception("Enter only number from 1 to 2.");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Wrong format input");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (choose == 1) {
                    flag = false;
                    System.out.println("Successful Exit");
                }
            }
        } while (flag);
    }

    @Override
    public Contract findContract(String code) {
        for (Contract c : contractList) {
            if (c.getBookingCode().equals(code)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean checkBookingCode(String bookingCode) {
        boolean isCheck = false;
        for (Contract c : contractList) {
            if (c.getBookingCode().equals(bookingCode)) {
                isCheck = true;
                break;
            }
        }
        return isCheck;
    }

}

