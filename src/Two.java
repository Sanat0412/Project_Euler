import java.util.ArrayList;

/*   Created by IntelliJ IDEA.
 *   Author: Sanat Kumar Dubey (sanat04)
 *   Date: 20-02-2024
 *   Time: 22:04
 *   File: Two.java
 */
//Even Fibonacci Numbers
public class Two {
    public static void main(String[] args) {
        long val=4000000;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        long sum=0;
        int i=2;
        for (i = 2;  ; i++) {
            int fin=arr.get(i-1)+arr.get(i-2);
            arr.add(fin);
            if(fin>val) break;
            else{
                if(fin%2==0) sum+=fin;
            }
        }
        System.out.println(sum);
    }
}

