import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestelement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest=arr[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }System.out.println(secondlargest);

    }
}
