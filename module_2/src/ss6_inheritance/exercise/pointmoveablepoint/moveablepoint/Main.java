package ss6_inheritance.exercise.pointmoveablepoint.moveablepoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint();
        System.out.println(moveablePoint1);
        MoveablePoint moveablePoint = new MoveablePoint(1, 2, 2, 4);
        System.out.println(moveablePoint);
        System.out.println("MoveablePoint: " + moveablePoint.move());
    }
}
