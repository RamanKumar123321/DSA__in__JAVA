import java.util.Scanner;
public class MaximumElementinArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arrays size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }else{
                max=max;
            }
        }
        System.out.println(max);
    }

}
