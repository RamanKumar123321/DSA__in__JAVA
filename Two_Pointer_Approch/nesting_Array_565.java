import java.util.*;
public class nesting_Array_565 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the No. of Element");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        boolean[] visited=new boolean[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                int count=0;
                int j=i;
                while(!visited[j]){
                    visited[j]=true;
                    j=nums[j];
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}
