import java.util.Scanner;
public class GCD {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter First Number: ");
        int b=sc.nextInt();
        int temp=0;
        while(b>0){
            temp=b;
            b=a%b;
            a=temp;

        }System.out.println("The GCD of two given number is: " +a);
    }
}
