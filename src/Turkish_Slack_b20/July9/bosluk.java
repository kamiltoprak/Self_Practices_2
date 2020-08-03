package Turkish_Slack_b20.July9;

import java.util.Scanner;

public class bosluk {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter full name ");
        String name = input.nextLine();
        name =name.trim();
        for (int i = 0; i <name.length(); i++) {
            name = name.replace("  "," ");
        }
        System.out.println(name);
    }

}
