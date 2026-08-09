import java.util.Scanner;
public class Factorial{
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int Factorial=1;
        for(int i=1;i<=a;i++){
            Factorial=Factorial*i;
        }System.out.println("Factorial of number is: " + Factorial);
    }
}