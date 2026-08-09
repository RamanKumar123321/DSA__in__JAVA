import java.util.Scanner;

public class Power {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        System.out.println("Power you want");
        int b=sc.nextInt();
        int power=1;
        for(int i=1;i<=b;i++){
            power*=a;
        }System.out.println("power of number is: " + power);
    }
}
