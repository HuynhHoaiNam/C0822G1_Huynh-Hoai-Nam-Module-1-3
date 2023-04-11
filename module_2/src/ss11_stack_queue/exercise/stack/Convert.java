package ss11_stack_queue.exercise.stack;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nhị phân");
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            /**
             * số nhập chia 2==> VD: 4/2 =2 dư 0, lấy 2/2=1 dư 0, lấy 1/2=0 dư 1,
             *thêm 1,thêm 0, thêm 0
             */
            stack.push(number % 2);
            number = number / 2;
        }

        String s = "";
        while (!stack.isEmpty()) {
            s += stack.pop() + "";
        }
        System.out.println("Số thập phân là: " + s);
    }
}
