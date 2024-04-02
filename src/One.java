/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 20-02-2024
 *   Time: 21:55
 *   File: One.java
 */
// Multiples of 3 or 5;
import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            long th=(n-1)/3;
            long fi=(n-1)/5;
            long fif=(n-1)/15;
            long sum1=(th*(th+1)/2)*3;
            long sum2=(fi*(fi+1)/2)*5;
            long sum3=(fif*(fif+1)/2)*15;
            sum+=sum1-sum3+sum2;
            System.out.println(sum);
        }
    }
}
