package ss7_adstractclass_interface.exercise.colorable;


public class Main {
    public static void main(String[] args) {
        Colorable[] colorables = new Colorable[3];
        colorables[0] = new Square(3.5, "Blue");
        colorables[1] = new Square(5.0, "Red");
        colorables[2] = new Square(7.1, "Black");

        for (Colorable colorable : colorables) {
            colorable.howToColor();
        }
    }
}
