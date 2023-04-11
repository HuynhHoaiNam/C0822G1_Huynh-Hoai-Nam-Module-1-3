package ss13_search_algorithm.practice;

public class BinarySearch {


   static int binarySearch(int[] arr, int k) {
        int low = 0;
        int hight = arr.length - 1;
        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (k < arr[mid])
                hight = mid - 1;
            else if (k == arr[mid])
                return mid;
            else
                low = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
         int[] arr = {1, 3, 5, 7, 8, 9, 12, 15, 30};
        int index= binarySearch(arr,8);
        System.out.println("Giá trị cần tìm tại index = "+ index);
    }
}


