package ss13_search_algorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> linkedList=new LinkedList<>();
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            LinkedList<Character> list= new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }if (list.size()>linkedList.size()){
                linkedList.clear();
                linkedList.addAll(list);
            }
            list.clear();
        }

        for (Character ch : linkedList){
            System.out.print(ch);
        }
    }
}
