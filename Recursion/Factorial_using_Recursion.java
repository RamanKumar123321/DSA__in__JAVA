import java.util.*;
public class Factorial_using_Recursion {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }

    int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
