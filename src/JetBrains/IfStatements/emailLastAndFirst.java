package JetBrains.IfStatements;

import java.util.Scanner;

public class emailLastAndFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName=email.substring(0,email.indexOf('_'));
        System.out.println("First Name: "+firstName);
        String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@'));
        System.out.println("First Name: "+lastName);
        String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
        System.out.println("Domain:"+domain);
        String extension=email.substring(email.indexOf('.')+1,email.length());
        System.out.println("Top-Level Domain: "+extension);
    }
}
