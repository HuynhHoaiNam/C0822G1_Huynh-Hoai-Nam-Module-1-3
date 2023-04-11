package ss14_sort_algorithm.exercise;

public class InsertSort {

    static int[] arr = {5, 2, 12, 4, 0, 19, 7};

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertSort(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
