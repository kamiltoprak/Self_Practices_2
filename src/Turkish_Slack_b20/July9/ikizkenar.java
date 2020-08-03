package Turkish_Slack_b20.July9;

import java.util.Scanner;

public class ikizkenar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String a="";
        for (int i = 1; i <n/2+1; i++) {
            for (int j = (n+3)/2-i; j <=(n/2)+i; j++) {
                for (int k = 1; k <(n/2); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
