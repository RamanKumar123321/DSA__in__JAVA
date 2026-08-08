import java.util.Scanner;
public class SumofDigits {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int sum=0;
        int b;
        while(a>0){
            b=a%10;
            sum+=b;
            a=a/10;
        }
        System.out.println("Number of digits: " +sum);
    }
}
