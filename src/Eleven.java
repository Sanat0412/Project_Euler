import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 05-04-2024
 *   Time: 22:03
 *   File: Eleven.java
 */
//Largest Product in a Grid
public class Eleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] grid=new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                grid[i][j]= sc.nextInt();
            }
        }
        int maxi = 0;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                maxi = Math.max(maxi,
                        Math.max(helper(grid, i, j, 1, 0),
                                helper(grid, i, j, 0, 1)));
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                maxi = Math.max(maxi,
                        Math.max( helper(grid, i, j, 1, 1),
                                helper(grid, i, j, 1, -1)));
            }
        }

        System.out.println(maxi);
    }

    static int helper(int[][] arr, int x, int y, int dx, int dy) {
        int product = 1;
        for (int i = 0; i < 4; i++) {
            if (x < 0 || y < 0 || x >= 20 || y >= 20) {
                return 0;
            }
            product *= arr[x][y];
            x += dx;
            y += dy;
        }
        return product;
    }
}

