import java.util.Scanner;

public class SumofArrays {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrays size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        System.out.print("Enter array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            }
        System.out.print(sum);
        }
    }