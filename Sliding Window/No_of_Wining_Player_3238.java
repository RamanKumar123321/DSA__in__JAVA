import java.util.*;
public class No_of_Wining_Player_3238 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] pick = new int[m][2];

        for (int i = 0; i < m; i++) {
            pick[i][0] = sc.nextInt();
            pick[i][1] = sc.nextInt();
        }

        int[][] count = new int[n][11];

        for (int[] p : pick) {
            count[p[0]][p[1]]++;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int color = 0; color <= 10; color++) {
                if (count[i][color] > i) {
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
