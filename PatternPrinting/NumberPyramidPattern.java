import java.util.Scanner;
public class NumberPyramidPattern {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of row you want");
        int a=sc.nextInt();
        System.out.println("The Triangle Pyramid is: ");
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i+1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
