import java.util.Arrays;
import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 05-04-2024
 *   Time: 21:36
 *   File: Ten.java
 */
//Summation of Primes
public class Ten {
    public static void main(String[] args) {
        final int SIZE = 1000000;
        boolean[] isPrime = new boolean[SIZE + 1];
        Arrays.fill(isPrime, true);
        long[] sums = new long[SIZE + 2];
        for (int i = 2; i <= SIZE; i++) {
            if (isPrime[i]) {
                sums[i] = sums[i - 1] + i;
                for (long j = (long) i * i; j <= SIZE; j += i) {
                    isPrime[(int) j] = false;
                }
            } else {
                sums[i] = sums[i - 1];
            }
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            System.out.println(sums[n]);
        }
    }
}

