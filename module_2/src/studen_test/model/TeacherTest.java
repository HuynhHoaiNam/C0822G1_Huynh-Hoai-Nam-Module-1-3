package studen_test.model;

import java.time.LocalDate;

public class TeacherTest extends PersonTest {
    private String specialize;

    public TeacherTest() {
    }

    public TeacherTest(String id, String name, LocalDate dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "TeacherTest{" + super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s", getId(), getName(), getDateOfBirth(), getGender(), getSpecialize());
    }
}
