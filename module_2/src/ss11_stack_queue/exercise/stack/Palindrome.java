package ss11_stack_queue.exercise.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = scanner.nextLine();
        String[] arr = str.toLowerCase().split("");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(" ")){
                stack.push(arr[i]);
                queue.offer(arr[i]);
            }
        }
        int size = stack.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (stack.pop().equals(queue.poll())) {
                count++;
            }
        }
        if (count == size) {
            System.out.println("Dãy Palindrome");
        } else {
            System.out.println("Không phải dãy Palindrome");
        }
    }
}
