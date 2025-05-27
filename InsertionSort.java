import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] result = sorting(arr, len);
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    static int[] sorting(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (arr[j] > key && j >= 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
