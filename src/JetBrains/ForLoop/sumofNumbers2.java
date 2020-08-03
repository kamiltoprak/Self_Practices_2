package JetBrains.ForLoop;

import java.util.Scanner;

/*7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050

        input: 50
        output: 1275

        input : 200
        output : 20100*/
public class sumofNumbers2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
        int num=scan.nextInt();
        int b=0;
        for (int i=1;i<=num;i++){
            b+=i;
        }
        System.out.println(b);
    }
}
