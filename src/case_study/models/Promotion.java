package case_study.models;

public class Promotion {
    private String customerId;
    private int voucher;

    public Promotion() {
    }

    public Promotion(String customerId, int usedTime) {
        this.customerId = customerId;
        this.voucher = usedTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Customer ID: "+getCustomerId()+", Voucher: "+ getVoucher();
    }
}
