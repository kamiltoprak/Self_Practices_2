package JetBrains.ForLoop;
//6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
public class sumOfOddNumbers {
    public static void main(String[] args) {
        int b=0;
        for (int i=1;i<=100;i++){
            if(i%2!=0){
                b+=i;
            }

        }
        System.out.println(b);
    }
}
