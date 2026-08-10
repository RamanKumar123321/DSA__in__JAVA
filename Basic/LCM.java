import java.util.Scanner;
public class LCM {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b=sc.nextInt();
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        for(int i=max;;i++){
            if(i%a==0 && i%b==0){
                System.out.println("LCM of Given Two number is: " + i);
                break;
            }
        }
    }
}
