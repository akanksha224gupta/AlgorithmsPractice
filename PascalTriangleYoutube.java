package Practice;

import java.util.Scanner;

public class PascalTriangleYoutube {

    // https://www.youtube.com/shorts/Dq5PSy4StCM
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] res = drawPascalTriangle(n);
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private static int[][] drawPascalTriangle(int n) {
        int[][] nos = new int[n][];
        for (int i = 0; i < n; i++) {
            nos[i] = new int[i + 1];
            nos[i][0] = 1; // First element of each row is 1
            for (int j = 1; j < i; j++) {
                nos[i][j] = nos[i - 1][j - 1] + nos[i - 1][j]; // Sum of the two elements above
            }
            nos[i][i] = 1; // Last element of each row is 1
        }
        return nos;
    }
}