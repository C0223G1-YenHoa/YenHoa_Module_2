package case_study.repository;

import case_study.models.Booking;
import case_study.models.Promotion;

import java.util.Stack;
import java.util.TreeSet;

public class PromotionRepository {
        private static TreeSet<String> customerList=new TreeSet<>();
        private Stack<Promotion> customerStack=new Stack<>();
        private BookingRepository bookingRepo=new BookingRepository();
        static{

        }

        public TreeSet<String> getCustomerList() {

                TreeSet<Booking> bookingList= bookingRepo.displayBookingList();
                for (Booking b: bookingList) {
                        customerList.add(b.getCustomerId());
                }
                return customerList;
        }

        public Stack<Promotion> getPromotionStack(){
                
                return customerStack;
        }
}
