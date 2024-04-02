import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 23-02-2024
 *   Time: 08:33
 *   File: Four.java
 */
//Largest Palindrome Product
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int v = sc.nextInt();
            int n = helper(v);
            System.out.println(n);
        }
    }
    static int helper(int v){
        int maxi=0;
        for (int i = 999; i>=100; i--) {
            for (int j = i; j >=100; j--) {
                 int pro=i*j;
                 if(isP(pro) && pro>maxi && pro<v) maxi=pro;
            }
        }
        return maxi;
    }
    static boolean isP(int n){
        String str = String.valueOf(n);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

