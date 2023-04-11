package furamaresort.models.person;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerType;
    private String address;


    public Customer() {
    }

    public Customer(String id, String name, LocalDate dateOfBirth, String gender, String idNumber,
                    String phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer| " + super.toString() +
                ", customerType:" + customerType +
                ", address:" + address;
    }

    public String getInfoCustomer() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getName(), getDateOfBirth(), getGender(),
                getIdNumber(), getPhoneNumber(), getEmail(), customerType, address);
    }
}
