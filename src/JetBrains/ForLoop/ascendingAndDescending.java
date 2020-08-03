package JetBrains.ForLoop;
/*Write a program that reads a sequence of integer numbers and outputs true
if the sequence is ordered (in ascending or descending order), otherwise, false. Keep in mind,
if a number has the same value as the following number, it does not break the order.
The sequence ends with 0. Do not consider this number as a part of the sequence.
 The sequence always has at least one number (excluding 0).
Sample Input 1:
9 8 7 6 5 4 3 2 1 0
Sample Output 1:
true
Sample Input 2:
1 2 3 3 9 0
Sample Output 2:
true
Sample Input 3:
1 2 5 5 2 3 0
Sample Output 3
false
*/
import java.util.Scanner;
public class ascendingAndDescending {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // put your code here
            int b = 0;
            String net = "";
            int[] a = new int[100];
            for (int i = 0; ; i++) {
                a[i] = scan.nextInt();
                b += 1;
                if (a[i] == 0) {
                    break;
                }
            }
            System.out.println(b);
            for (int j = 1; j < (b - 1); j++) {
                if ((a[j] - a[j - 1]) >= 0) {
                    System.out.println(a[j] - a[j - 1]);
                    net = "true";
                } else {
                    System.out.println(a[j] - a[j - 1]);
                    net = "false";
                    break;
                }
            }
            if (net=="false"){
                for (int m = 1; m < (b - 1); m++) {
                    if ((a[m - 1] - a[m]) >= 0) {
                        System.out.println(a[m - 1] - a[m]);
                        net = "true";
                    } else {
                        net = "false";
                        break;
                    }
                }
            }
            if(b==2){
                net = "true";
            }
            System.out.println(net);
        }
}

