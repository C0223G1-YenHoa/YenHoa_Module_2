package case_study.repository;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.*;

public class ContractRepository implements IContractRepository {
    protected static Queue<Booking> bookingQueue = new ArrayDeque<>();
    private Queue<Contract> contractList = new ArrayDeque<>();
    private static final BookingRepository bookingRepository = new BookingRepository();

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
    public void editContract(Contract contract) {
        for (Contract c: contractList) {
            if (c.getBookingCode().equals(contract.getBookingCode())){
                contractList.remove();
                contractList.offer(contract);
            }
        }
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

