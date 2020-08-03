package Turkish_Slack_b20.javaInterviews;

import java.util.Scanner;

public class Dublicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String a="";
        for (int i = 0; i <word.length() ; i++) {
            String newWord=word.substring(i,i+1);
            if(!a.contains(newWord)){
                a+=newWord;
            }

        }
        System.out.println(a);
    }
}
