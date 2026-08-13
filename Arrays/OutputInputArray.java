import java.util.Scanner;
public class OutputInputArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array Elements ");
        int[] Raman=new int[10];
        for(int i=0;i<10;i++) {
            Raman[i] = sc.nextInt();
        }
        System.out.println("output of the Arrays");
        for(int i=0;i<10;i++) {
            System.out.print(Raman[i] + " ");
        }

    }
}
