package JetBrains.IfStatements;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        ;
        int count=0;
        for(int  i=0; i<word.length();i++)
        {
            String print=""+word.charAt(i);
            if(!print.equalsIgnoreCase("a") && !print.equalsIgnoreCase("o") &&
                    !print.equalsIgnoreCase("e") &&!print.equalsIgnoreCase("i") && !print.equalsIgnoreCase("u")
            ){
                count++;

            }
        }
        System.out.print(count);
    }
}
