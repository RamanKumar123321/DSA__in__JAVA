import java.util.*;
public class Maximum_Subarray2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

    int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            max=Math.max(max,sum);
        }
    }
      System.out.println(max);
}
}
