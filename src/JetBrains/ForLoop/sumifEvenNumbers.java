package JetBrains.ForLoop;
//5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
public class sumifEvenNumbers {
    public static void main(String[] args) {
        int b=0;
        for (int i=1;i<=100;i++){
            if(i%2==0){
                b+=i;
            }

        }
        System.out.println(b);
    }
}
