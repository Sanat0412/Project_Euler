import java.util.Scanner;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 25-02-2024
 *   Time: 17:52
 *   File: Eight.java
 */
//Largest Product in a Series
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            long maxi = 0;
            for (int i = 0; i < str.length() -k; i++) {
                long pro = 1;
                for (int j = i; j < i + k; j++) {
                    int v = Character.getNumericValue(str.charAt(j));
                    pro *= v;
                }
                maxi = Math.max(pro, maxi);
            }
            System.out.println(maxi);
        }
    }
}