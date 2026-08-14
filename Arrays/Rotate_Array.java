import java.util.*;

import static java.util.Collections.reverse;

public class Rotate_Array {
    static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of elements");

      int n=sc.nextInt();
      System.out.println("Enter elements");
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
        System.out.println("Enter index position to rotate");

        int k=sc.nextInt();
      k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
      }
    static void reverse(int[] arr, int front, int rear) {
        while (front < rear) {
            int temp = arr[front];
            arr[front] = arr[rear];
            arr[rear] = temp;
            front++;
            rear--;
            System.out.println(Arrays.toString(arr));
        }


    }
}