/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 24-02-2024
 *   Time: 20:43
 *   File: Seven.java
 */
//10001st Prime
public class Seven {
    public static void main(String[] args) {
        int n = helper(6);
        System.out.println(n);
    }

    public static int helper(int n) {
        int lim = 110000;
        boolean[] check = new boolean[lim];
        int count = 0;

        for (int i = 2; i < lim; i++) {
            if (!check[i]) {
                count++;
                if (count == n) {
                    return i;
                }
                for (int j = i * 2; j < lim; j += i) {
                    check[j] = true;
                }
            }
        }
        return -1;
    }
}
