/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 24-02-2024
 *   Time: 20:36
 *   File: Six.java
 */
//Sum Square Difference
public class Six {
    public static void main(String[] args) {
        int n=100;
        long fin=((n*(n+1))/2);
        long val=((n*(n+1))*((2*(n))+1))/6;
        long ans=((fin*fin)-val);
        System.out.println(ans);
    }
}

