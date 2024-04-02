import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 02-04-2024
 *   Time: 20:48
 *   File: Nine.java
 */
//Special Pythagorean Triplet
public class Nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long fin = -1;
            for (long k=2; k<=n/3; k++) {
                long j = ((n*n)-(2*n*k)) / (2*(n-k));
                long i = n - k - j;
                if (k*k + j*j == i*i) {
                    fin = Math.max(fin, k*j*i);
                }
            }
            System.out.println(fin);
        }
    }
}

