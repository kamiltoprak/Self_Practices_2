package Turkish_Slack_b20.July9;

import java.util.Scanner;

public class countNoWovels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String print = "" + word.charAt(i);
            if (!print.equalsIgnoreCase("a") && !print.equalsIgnoreCase("o") &&
                    !print.equalsIgnoreCase("e") && !print.equalsIgnoreCase("i") && !print.equalsIgnoreCase("u")
            ) {
                count++;
            }
        }
        System.out.print(count);
    }
}
