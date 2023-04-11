package ss4_class_oop.exercise.fanclass;

import java.util.Scanner;

public class MainFanClass {
    public static void main(String[] args) {
        FanClass fanClass = new FanClass();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chế độ 1:" + "\n");
        System.out.print("Chế độ 2:" + "\n");
        System.out.print("Chọn chế độ: ");
        int regime = Integer.parseInt(scanner.nextLine());
            if (regime == 1) {
                fanClass.on = true;
                fanClass.color = "yellow";
                fanClass.speed = fanClass.FAST;
                fanClass.radius = 10;
                System.out.print(fanClass.display());
            } else if (regime == 2) {
                fanClass.on = false;
                System.out.print(fanClass.display2());
            }

        }
}

