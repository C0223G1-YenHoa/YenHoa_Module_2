package case_study.repository;

import case_study.models.Booking;

import java.util.TreeSet;

public interface IBookingRepository{
    void addBooking(Booking booking);
    TreeSet<Booking> displayBookingList();
}
