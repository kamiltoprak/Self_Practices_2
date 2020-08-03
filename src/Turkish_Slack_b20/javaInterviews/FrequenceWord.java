package Turkish_Slack_b20.javaInterviews;

import java.util.Scanner;

public class FrequenceWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please  enter your word");
        String str=scan.next();
        for (int i = 0; i <str.length(); ) {
            int count=0;
            String a=str.substring(i,i+1);
            for (int j = 0; j < str.length(); j++) {
                if(str.substring(j,j+1).equals(a)){
                    count++;
                }
            }
            str=str.replaceAll(a,"");
            System.out.print(a+count);
        }
    }
}
