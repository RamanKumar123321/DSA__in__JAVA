import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
         }
        if(index!=-1){
            System.out.println("Element is given in Arrays");
        }else{
            System.out.println("Element is not given in Arrays");
        }


    }
}
