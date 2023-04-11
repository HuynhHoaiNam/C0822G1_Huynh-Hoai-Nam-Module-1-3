package ss10_dsa_list.practice.liststudy;

public class TestList {
    public static void main(String[] args) {
        ListStudy<Integer> listInteger = new ListStudy<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

//        listInteger.get(5);
//        System.out.println("element 6: " + listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
