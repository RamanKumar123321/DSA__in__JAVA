import java.util.Scanner;
public class ShuffletheArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the No. of Element");
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        int index=0;
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++){
            ans[index++]=arr[i];
            ans[index++]=arr[n+i];
        }
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
