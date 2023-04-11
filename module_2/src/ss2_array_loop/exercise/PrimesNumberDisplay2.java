package ss2_array_loop.exercise;

public class PrimesNumberDisplay2 {
    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        while (prime < 100) {
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                    continue;
                }
            }
            if (count == 2) {
                System.out.print(prime + "\t");
            }
            prime++;
            count = 0;
        }
    }
}
