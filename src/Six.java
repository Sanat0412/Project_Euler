import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 24-02-2024
 *   Time: 20:36
 *   File: Six.java
 */
//Sum Square Difference
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long fin = ((n * (n + 1)) / 2);
            long val = ((n * (n + 1)) * ((2 * (n)) + 1)) / 6;
            long ans = ((fin * fin) - val);
            System.out.println(ans);
        }
    }
}

