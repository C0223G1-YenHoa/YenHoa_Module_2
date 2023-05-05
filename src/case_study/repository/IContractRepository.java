package case_study.repository;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.Queue;

public interface IContractRepository{
     void createContract(Contract contract);
     Queue<Contract> getListContract();
     Queue<Booking> getBookingQueue();
     void editContract(String code);
     Contract findContract(String code);
     boolean checkBookingCode(String bookingCode);

}
