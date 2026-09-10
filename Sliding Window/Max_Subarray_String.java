import java.util.*;
public class Max_Subarray_String {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=a[j];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
            double avg=(double)maxSum/k;
            System.out.println("Maximum Average"+avg);
        }
    }
}
