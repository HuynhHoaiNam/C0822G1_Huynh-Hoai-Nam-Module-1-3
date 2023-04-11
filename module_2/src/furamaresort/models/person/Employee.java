package furamaresort.models.person;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;
    private String location;
    private String wage;

    public Employee() {
    }


    public Employee(String id, String name, LocalDate dateOfBirth, String gender, String idNumber,
                    String phoneNumber, String email, String level, String location, String wage) {
        super(id, name, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getEmployee() {
        return level;
    }

    public void setEmployee(String employee) {
        this.level = employee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee| " + super.toString() +
                "employee:" + level +
                ", location:" + location +
                ", wage:" + wage;
    }

    public String getInfoEmployee() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getName(), getDateOfBirth(), getGender(),
                getIdNumber(), getPhoneNumber(), getEmail(), level, location, wage);
    }
}
