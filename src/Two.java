
/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 20-02-2024
 *   Time: 22:04
 *   File: Two.java
 */
//Even Fibonacci Numbers
import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long val = sc.nextLong();
            long a = 0;
            long b = 1;
            long sum = 0;
            while (a + b <= val) {
                long fin = a + b;
                if (fin % 2 == 0) {
                    sum += fin;
                }
                a = b;
                b = fin;
            }
            System.out.println(sum);
        }
    }
}

