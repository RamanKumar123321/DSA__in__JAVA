import java.util.*;
public class First_Negative_in_Windows_of_Size_K {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] nums=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int negative=0;
            for(int j=i;j<i+k;j++) {
                if (arr[j] < 0) {
                    negative = arr[j];
                    break;
                }
            }
            nums[i]=negative;
        }
        System.out.println(Arrays.toString(nums));
    }
}
