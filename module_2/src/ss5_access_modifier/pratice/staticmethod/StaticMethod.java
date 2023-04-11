package ss5_access_modifier.pratice.staticmethod;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

   public StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.print(rollno + "" + name + "" + college);
    }


}
