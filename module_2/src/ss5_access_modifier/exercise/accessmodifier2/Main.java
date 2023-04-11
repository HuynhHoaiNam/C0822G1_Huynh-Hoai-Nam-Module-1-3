package ss5_access_modifier.exercise.accessmodifier2;



public class Main {
    public static void main(String[] args) {
        WriteOnlyClass writeOnlyClass = new WriteOnlyClass();
        System.out.print("Name: " + writeOnlyClass.setName() + "\n");
        System.out.print("Stydying: " + writeOnlyClass.setClasses());
    }
}
