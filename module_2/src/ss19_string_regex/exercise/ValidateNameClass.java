package ss19_string_regex.exercise;

import java.util.Scanner;

public class ValidateNameClass {

    public static void main(String[] args) {
        String nameCheck = "^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Lớp:");
        String nameClass = scanner.nextLine();
        System.out.println(nameClass.matches(nameCheck));
    }


}
