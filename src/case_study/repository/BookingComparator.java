package case_study.repository;

import case_study.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getBookingDay().isBefore(o2.getBookingDay()) ? -1 : 1;
    }


}
