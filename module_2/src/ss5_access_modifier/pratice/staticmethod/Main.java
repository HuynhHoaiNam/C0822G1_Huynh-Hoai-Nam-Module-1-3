package ss5_access_modifier.pratice.staticmethod;

public class Main {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod student = new StaticMethod(6, "A");
        StaticMethod student2 = new StaticMethod(8, "B");
        StaticMethod student3 = new StaticMethod(9, "C");

        student.display();
        student2.display();
        student3.display();
    }
}
