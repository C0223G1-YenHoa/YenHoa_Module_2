package case_study.services;

import case_study.models.Booking;
import case_study.models.Facility;
import case_study.repository.BookingRepository;
import case_study.repository.FacilityRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    private static final Scanner sc = new Scanner(System.in);
    private final BookingRepository bookingRepository = new BookingRepository();
    private final CustomerService customerService = new CustomerService();
    private final FacilityRepository facilityRepository = new FacilityRepository();
    private LinkedHashMap<Facility, Integer> linkedHashMap = facilityRepository.getLinkedHashMap();


    @Override
    public void addBooking() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter Booking Code: ");
        String bookingCode = sc.nextLine();
        System.out.print("Booking Date(yyyy-MM-dd): ");
        LocalDate bookingDate = LocalDate.parse(sc.nextLine(), formatter);
        System.out.print("Rental start date(yyyy-MM-dd): ");
        LocalDate startDate = LocalDate.parse(sc.nextLine(), formatter);
        System.out.print("Rental end date(yyyy-MM-dd): ");
        LocalDate endDate = LocalDate.parse(sc.nextLine(), formatter);
        customerService.displayList();
        String customerId;
        do {
            System.out.print("Enter customer ID: ");
            customerId = sc.nextLine();
            try {
                if (!Validate.regexCustomerId(customerId)) {
                    throw new Exception("Wrong format input.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!Validate.regexCustomerId(customerId));

        facilityRepository.display(1);
        String serviceCode;
        do {
            System.out.print("Enter service code: ");
            serviceCode = sc.nextLine();

            try {
                if (!(Validate.regexRO(serviceCode) | Validate.regexHO(serviceCode) | Validate.regexVl(serviceCode))) {
                    throw new Exception("Wrong format input.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!(Validate.regexRO(serviceCode) | Validate.regexHO(serviceCode) | Validate.regexVl(serviceCode)));
        boolean flag = false;
        for (Facility f : linkedHashMap.keySet()) {
            if (f.getServiceCode().equals(serviceCode)) {
                if (linkedHashMap.get(f) >= 5) {
                    flag = false;
                } else {
                    flag=true;
                }
            }
        }
        if(flag==true){
            Booking booking = new Booking(bookingCode, bookingDate, startDate, endDate, customerId, serviceCode);
            bookingRepository.addBooking(booking);
        }else{
            System.out.println("Service is under maintenance.");
        }
    }


    @Override
    public void displayListBooking() {
        TreeSet<Booking> bookingList = bookingRepository.displayBookingList();
        for (Booking b : bookingList) {
            System.out.println(b.toString());
        }
    }
}

