package Turkish_Slack_b20.javaInterviews;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your word");
        String str=scan.next();
           String a="";
            for (int j = 0; j < str.length(); j++) {
                char ch=str.charAt(j);
                if(str.indexOf(ch)==str.lastIndexOf(ch)){
                    a+=ch;
                    str.replaceAll(str.substring(j,j+1),"");
                }
            }
            System.out.print(a);
    }
}

