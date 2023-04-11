package ss2_array_loop.exercise;

public class DisplayTypes {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n" + "\n");
        for (int k = 0; k < 8; k++) {
            for (int h = 0; h < k; h++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//
        System.out.print("\n" + "\n");
        for (int e = 8; e >0; e--) {
            for (int l = 0; l < e; l++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
