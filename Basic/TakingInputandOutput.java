import java.util.Scanner;
public class TakingInputandOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Int");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String");
        String b=sc.nextLine();

        System.out.println("Enter Double");
        double c=sc.nextDouble();
        System.out.println("Enter Float");
        float d=sc.nextFloat();
        System.out.println("Enter Boolean(True/False)");
        boolean e=sc.nextBoolean();
        System.out.println("");
        System.out.println("Int=" +a);
        System.out.println("String=" +b);
        System.out.println("Double=" +c);
        System.out.println("Float=" +d);
        System.out.println("Boolean=" +e);
    }
}
