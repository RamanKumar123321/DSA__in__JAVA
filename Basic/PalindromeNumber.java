import java.util.Scanner;
public class PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int z = a;
        int b=0;
        while (a > 0) {
            int c = a % 10;
            b = b * 10 + c;
            a = a / 10;
        }
        if(b==z){
            System.out.println("Given number is Palindrome number");
        }else{
            System.out.println("Given number is Not Palindrome number");
        }
    }
}
