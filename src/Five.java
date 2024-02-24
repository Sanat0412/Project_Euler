/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 24-02-2024
 *   Time: 20:29
 *   File: Five.java
 */

public class Five {
    static long gcd(long a, long b) {
        if (b > a) {
            return gcd(b, a);
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        long a=1;
        for (int i = 1; i <=20; i++) {
            a=lcm(a,i);
        }
        System.out.println(a);
    }
}

