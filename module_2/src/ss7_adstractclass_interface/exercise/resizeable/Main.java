package ss7_adstractclass_interface.exercise.resizeable;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3.0, "blue");
        resizeables[1] = new Rectangle(3.2, 5.3);
        resizeables[2] = new Square(5.6, "black");

        System.out.println("Pre-sorted: ");
        for (Resizeable resizeable : resizeables) {
            System.out.println(resizeable);
        }
        System.out.println("\nAfter-sorted:");
        for (Resizeable resizeable : resizeables) {
            resizeable.reisize(50);
            System.out.println(resizeable);
        }

//        if (resizeables[0] instanceof Circle) {
//            resizeables[0].reisize(50);
//            System.out.println(resizeables[0]);
//        }
//        if (resizeables[1] instanceof Circle) {
//            resizeables[1].reisize(20);
//            System.out.println(resizeables[1]);
//        }
//        if (resizeables[2] instanceof Circle) {
//            resizeables[2].reisize(15);
//            System.out.println(resizeables[2]);
//        }
    }
}
