package ss10_dsa_list.exercise.listmanager.model;

public class Student extends Person implements Comparable<Student> {
    private String nameClass;
    private double score;

    public Student() {
    }

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String id, String name, String dateOfBirth, Boolean genDer, String nameClass, double score) {
        super(id, name, dateOfBirth, genDer);
        this.nameClass = nameClass;
        this.score = score;
    }


    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() +
                "nameClass= " + nameClass + '\'' +
                ", score= " + score;

    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s", getId(), getName(), getDateOfBirth(), getGenDer(), nameClass, score);
    }

    @Override
    public int compareTo(Student o) {
        if (this.getName().compareTo(o.getName()) != 0) {
            return this.getName().compareTo(o.getName());
        }
        return this.getId().compareTo(o.getId());
    }
}
