package JetBrains.IfStatements;

import java.util.Scanner;

public class newEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String newEmail="";
        if(email.contains("_")){
            int a=email.indexOf("_");
            int b=email.indexOf("@");
            String first=email.substring(a+1,b);
            String last=email.substring(0,a);
            newEmail=first+"_"+last+"@gmail.com";
        }

        System.out.println(newEmail);
    }
}
