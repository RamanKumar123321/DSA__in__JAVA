import java.util.Arrays;
import java.util.Scanner;
public class LargestElementinArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of element in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The largest element in array is: ");
        System.out.println(arr[n-1]);


    }
}
