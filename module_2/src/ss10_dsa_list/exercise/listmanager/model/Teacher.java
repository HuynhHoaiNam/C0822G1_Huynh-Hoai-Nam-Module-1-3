package ss10_dsa_list.exercise.listmanager.model;

public class Teacher extends Person implements Comparable<Teacher> {
    private String specialize;

    public Teacher() {
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(String id, String name, String dateOfBirth, Boolean genDer, String specialize) {
        super(id, name, dateOfBirth, genDer);
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
        return "Teacher: " + super.toString() +
                "specialize= " + specialize + '\'';
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.getName().compareTo(o.getName()) != 0) {
            return this.getName().compareTo(o.getName());
        }
        return this.getId().compareTo(o.getId());
    }
}
