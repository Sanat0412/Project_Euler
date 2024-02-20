/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 20-02-2024
 *   Time: 21:55
 *   File: One.java
 */
// Multiples of 3 or 5;
    public class One {
        public static void main(String[] args) {
            long sum=0;
            for(int i=3;i<1000;i++){
                if(i%3==0 || i%5==0) sum+=i;
            }
            System.out.println(sum);
        }
    }