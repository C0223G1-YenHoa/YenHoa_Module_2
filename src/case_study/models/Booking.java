package case_study.models;

import java.time.LocalDate;

public class Booking implements Comparable<Booking> {
    //mã booking, ngày booking, ngày bắt đầu thuê, ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    private String bookingId;
    private LocalDate bookingDay;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String serviceCode;

    public Booking() {
    }

    public Booking(String bookingId, LocalDate bookingDay, LocalDate startDate, LocalDate endDate, String customerId, String serviceCode) {
        this.bookingId = bookingId;
        this.bookingDay = bookingDay;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceCode = serviceCode;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(LocalDate bookingDay) {
        this.bookingDay = bookingDay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking Code: " + bookingId + ", Booking Date: " + getBookingDay() + " ,Rental Start Date: " + getStartDate() +
                ", Rental End Date: " + getEndDate() + ", Customer ID: " + getCustomerId() + ", Service Code: " + getServiceCode();
    }

    @Override
    public int compareTo(Booking o) {
        if (this.getStartDate().equals(o.getStartDate())) {
            return this.getEndDate().compareTo(o.getEndDate());
        } else
            return this.getStartDate().compareTo(o.getStartDate());
    }
}
