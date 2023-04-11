package ss1_Introduction_to_java.exercise;

import java.util.Scanner;

public class Read_numbers_into_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số muốn đọc");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            String count;
            switch (number) {
                case 0:
                    count = "zero";
                    break;
                case 1:
                    count = "one";
                    break;
                case 2:
                    count = "two";
                    break;
                case 3:
                    count = "three";
                    break;
                case 4:
                    count = "four";
                    break;
                case 5:
                    count = "five";
                    break;
                case 6:
                    count = "six";
                    break;
                case 7:
                    count = "seven";
                    break;
                case 8:
                    count = "eight";
                    break;
                case 9:
                    count = "nine";
                    break;
                default:
                    count = " ";
            }
            if (!count.equals(" ")) System.out.printf("%s", count);
            else System.out.println("Invalid input!");
        } else if (number >= 10 && number < 20) {
            String count2;
            switch (number) {
                case 10:
                    count2 = "ten";
                    break;
                case 11:
                    count2 = "eleven";
                    break;
                case 12:
                    count2 = "twelfth";
                    break;
                case 13:
                    count2 = "thirteen";
                    break;
                case 14:
                    count2 = "fourteen";
                    break;
                case 15:
                    count2 = "fifteen";
                    break;
                case 16:
                    count2 = "sixteen";
                    break;
                case 17:
                    count2 = "seventeen";
                    break;
                case 18:
                    count2 = "eighteen";
                    break;
                case 19:
                    count2 = "nineteen";
                    break;
                default:
                    count2 = " ";
            }
            if (!count2.equals(" ")) System.out.printf("%s", count2);
            else System.out.print("Invalid input!");
        } else if (number >= 20 && number < 100) {
            String count3;
            int tens = number / 10;
            int ones = number % 10;

            switch (tens) {
                case 2:
                    count3 = "twenty";
                    break;
                case 3:
                    count3 = "thirty";
                    break;
                case 4:
                    count3 = "fourty";
                    break;
                case 5:
                    count3 = "fifty";
                    break;
                case 6:
                    count3 = "sixty";
                    break;
                case 7:
                    count3 = "seventy";
                    break;
                case 8:
                    count3 = "eighty";
                    break;
                case 9:
                    count3 = "ninety";
                    break;
                default:
                    count3 = " ";
            }
            String count4;
            switch (ones) {
                case 1:
                    count4 = "one";
                    break;
                case 2:
                    count4 = "two";
                    break;
                case 3:
                    count4 = "three";
                    break;
                case 4:
                    count4 = "four";
                    break;
                case 5:
                    count4 = "five";
                    break;
                case 6:
                    count4 = "six";
                    break;
                case 7:
                    count4 = "seven";
                    break;
                case 8:
                    count4 = "eight";
                    break;
                case 9:
                    count4 = "nine";
                    break;
                default:
                    count4 = " ";
            }
            if (!count3.equals(" ") || !count4.equals(" ")) System.out.printf("%s %s", count3, count4);
            else System.out.print("Invalid input!");
        } else if (number >= 100 && number < 1000) {
            int hundred = number / 100;
            int tens2 = number / 10 % 10;
            int ones2 = number % 10;
            String count5;
            switch (hundred) {
                case 1:
                    count5 = "one hundred and";
                    break;
                case 2:
                    count5 = "two hundred and";
                    break;
                case 3:
                    count5 = "three hundred and";
                    break;
                case 4:
                    count5 = "four hundred and";
                    break;
                case 5:
                    count5 = "five hundred and";
                    break;
                case 6:
                    count5 = "six hundred and";
                    break;
                case 7:
                    count5 = "seven hundred and";
                    break;
                case 8:
                    count5 = "eight hundred and";
                    break;
                case 9:
                    count5 = "nine hundred and";
                    break;
                default:
                    count5 = " ";
            }
            String count6;
            switch (tens2) {
                case 1:
                    count6 = "eleven";
                    break;
                case 2:
                    count6 = "twenty";
                    break;
                case 3:
                    count6 = "thirty";
                    break;
                case 4:
                    count6 = "forty";
                    break;
                case 5:
                    count6 = "fifty";
                    break;
                case 6:
                    count6 = "sixty";
                    break;
                case 7:
                    count6 = "seventy";
                    break;
                case 8:
                    count6 = "eighty";
                    break;
                case 9:
                    count6 = "ninety";
                    break;
                default:
                    count6 = " ";
            }
            String count7;
            switch (ones2) {
                case 1:
                    count7 = "one";
                    break;
                case 2:
                    count7 = "two";
                    break;
                case 3:
                    count7 = "three";
                    break;
                case 4:
                    count7 = "four";
                    break;
                case 5:
                    count7 = "five";
                    break;
                case 6:
                    count7 = "six";
                    break;
                case 7:
                    count7 = "seven";
                    break;
                case 8:
                    count7 = "eight";
                    break;
                case 9:
                    count7 = "nine";
                    break;
                default:
                    count7 = " ";
            }
            if (!count5.equals(" ") || !count6.equals(" ") || !count7.equals(""))
                System.out.printf("%s %s %s", count5, count6, count7);
            else System.out.print("Invalid input!");
        }
    }
}
