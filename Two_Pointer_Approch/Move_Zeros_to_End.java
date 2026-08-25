import java.util.*;
public class Move_Zeros_to_End {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in Array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] nums=new int[n];
        for(int i=0,j=0;i<n;i++){
            if(arr[i]!=0){
                nums[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
