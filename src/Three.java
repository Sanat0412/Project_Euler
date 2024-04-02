/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 22-02-2024
 *   Time: 22:08
 *   File: Three.java
 */
//Largest Prime Factor
import java.util.ArrayList;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<>();
            while (n % 2 == 0) {
                arr.add((long) 2);
                n /= 2;
            }
            for (long i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    arr.add(i);
                    n /= i;
                }
            }
            if (n > 2) arr.add(n);
            System.out.println(arr.get(arr.size() - 1));
        }
    }
}

