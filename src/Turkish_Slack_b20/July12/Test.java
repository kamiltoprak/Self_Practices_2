package Turkish_Slack_b20.July12;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[] data = new int[3];
        int a=data[0];
        int b=data[1];
        int c=a+b;
        for (int i = 0; i <3 ; i++) {
            data[i]=scan.nextInt();
        }
        System.out.println(c);
    }
}
