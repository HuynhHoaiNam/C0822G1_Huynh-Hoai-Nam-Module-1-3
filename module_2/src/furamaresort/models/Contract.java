package furamaresort.models;

public class Contract {
    private String numberOfContracts;
    private String bookingId;
    private int deposit;
    private int payments;
    private String customerId;

    public Contract() {
    }

    public Contract(String numberOfContracts, String bookingId, int deposit, int payments, String customerId) {
        this.numberOfContracts = numberOfContracts;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.payments = payments;
        this.customerId = customerId;
    }

    public String getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(String numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getPayments() {
        return payments;
    }

    public void setPayments(int payments) {
        this.payments = payments;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "SomeContracts='" + numberOfContracts + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposit=" + deposit +
                ", payments=" + payments +
                ", customerId='" + customerId + '\'' +
                '}';
    }
    public String getInfoContracts() {
        return String.format("%s,%s,%s,%s,%s",getNumberOfContracts(),getBookingId(),getDeposit(),getPayments(),getCustomerId());
    }
}
