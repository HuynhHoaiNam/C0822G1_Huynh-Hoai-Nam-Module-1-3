package ss10_dsa_list.exercise.listmanager.model;

public class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private Boolean genDer;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, Boolean genDer) {
        this.id = id;
        this.name = name;
        this.dateOfBirth=dateOfBirth;
        this.genDer = genDer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGenDer() {
        return genDer;
    }

    public void setGenDer(Boolean genDer) {
        this.genDer = genDer;
    }

    @Override
    public String toString() {
        return
                "id= " + id + '\'' +
                ", name= " + name + '\'' +
                ", dateOfBirth= " + dateOfBirth +
                ", genDer= " + genDer +
                '}';
    }
}
