package studen_test.model;

import java.time.LocalDate;

public class StudentTest extends PersonTest {
    private String namClass;
    private double score;

    public StudentTest() {
    }

    public StudentTest(String id, String name, LocalDate dateOfBirth, String gender, String namClass, double score) {
        super(id, name, dateOfBirth, gender);
        this.namClass = namClass;
        this.score = score;
    }

    public String getNamClass() {
        return namClass;
    }

    public void setNamClass(String namClass) {
        this.namClass = namClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentTest{" +super.toString()+
                "namClass='" + namClass + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",getId(),getName(),getDateOfBirth(),
                getGender(),getNamClass(),getScore());
    }
}
