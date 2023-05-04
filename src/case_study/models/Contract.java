package case_study.models;

public class Contract {
    private int contractId;
    private String bookingCode;
    private double deposit;
    private double payment;
    private static int countId = 0;

    public Contract() {
    }

    public Contract(String bookingCode, double deposit, double payment) {
        this.contractId = ++countId;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.payment = payment;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Contract: "+ contractId +", Booking Code: "+getBookingCode()+", Deposit: "+ getDeposit()
                + ", Total payment: "+getPayment();
    }
}
