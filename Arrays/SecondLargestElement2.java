import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int i = n - 2;
        while (i >= 0 && arr[i] == largest) {
            i--;
        }
        if (i < 0) {
            System.out.println("No second largest element");
        } else {

            System.out.println("Second largest element is: "+arr[i]);
        }
    }
}
