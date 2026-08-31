import java.util.*;
public class Sliding_Window {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            sum+=arr[i];
            if(i<k-1)continue;
            max=Math.max(max,sum);
            int min=i-(k-1);
            sum-=arr[min];
        }
        System.out.println(max);
    }
}
