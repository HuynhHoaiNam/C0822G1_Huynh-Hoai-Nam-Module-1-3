package ss11_stack_queue.exercise.stack;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {


    public static void main(String[] args) {
        /**
         * Đảo ngược phần tử
         */
//        Stack<Integer> stack = new Stack<>();
//        Stack<Integer> stack1 = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập độ dài của mảng:");
//        int size = scanner.nextInt();
//        int index;
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhập phần tử thứ: " + i);
//            stack.push(index = scanner.nextInt());
//        }
//        System.out.println("Mảng ban đầu");
//        System.out.println(stack);
//
//        for (int i = 0; i < size; i++) {
//            stack1.push(stack.pop());
//        }
//        System.out.println("\nMảng đã đảo ngược");
//        System.out.println(stack1);



        /**
         * Đảo ngược chuỗi
         */
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        System.out.println("Nhập vào 1 chuỗi");
        String wWord = scanner.nextLine();
        String[] mWord = wWord.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            stack.push(mWord[i]);
        }
        String s = "";
        for (int i = 0; i < mWord.length; i++) {
            s += stack1.push(stack.pop()) + " ";
        }
        System.out.println("\nChuỗi sau khi đảo ngược");
        System.out.println(s);
    }
}
