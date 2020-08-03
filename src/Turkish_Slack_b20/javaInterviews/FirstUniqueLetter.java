package Turkish_Slack_b20.javaInterviews;

import java.util.Scanner;

public class FirstUniqueLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String a="";
        for (int j = 0; j < word.length(); j++) {
            char ch=word.charAt(j);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                System.out.println(""+ch);
                break;
            }
        }
        System.out.print(a);
    }
}
