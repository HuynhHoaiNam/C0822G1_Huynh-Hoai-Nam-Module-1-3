package ss5_access_modifier.exercise.accessmodifier2;

public class WriteOnlyClass {
    private String name = "Jonh";
    private String classes = "C02";

    public WriteOnlyClass() {
    }

    public String setName() {
        return this.name = name;
    }

    public String setClasses() {
        return this.classes = classes;
    }

}
