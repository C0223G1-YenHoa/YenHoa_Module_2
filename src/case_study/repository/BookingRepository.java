package case_study.repository;

import case_study.models.Booking;
import case_study.models.Facility;

import java.time.LocalDate;

import java.util.Map;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static TreeSet<Booking> bookingList = new TreeSet<>();
    private FacilityRepository facilityRepository=new FacilityRepository();

    static {
        bookingList.add(new Booking("001",LocalDate.of(2023,5,6), LocalDate.of(2023, 5,10), LocalDate.of(2023, 5 ,15), "KH-1234",
                "SVHO-1111"));
        bookingList.add(new Booking("002", LocalDate.of(2023,4,8), LocalDate.of(2023 , 5 , 10), LocalDate.of(2023, 5,17), "KH-5678",
                "SVRO-1111"));
        bookingList.add(new Booking("003",LocalDate.of(2023,5,3), LocalDate.of(2023 , 5 , 8), LocalDate.of(2023, 5 ,12), "KH-0987",
                "SVVL-1111"));
    }


    @Override
    public void addBooking(Booking booking) {
        bookingList.add(booking);
        for (Map.Entry<Facility,Integer> entry :facilityRepository.linkedHashMap.entrySet()) {
            if(entry.getKey().getServiceCode().equals(booking.getServiceCode()))
                facilityRepository.linkedHashMap.put(entry.getKey(), entry.getValue()+1);
        }

    }

    @Override
    public TreeSet<Booking> displayBookingList() {
        return bookingList;
    }
}
