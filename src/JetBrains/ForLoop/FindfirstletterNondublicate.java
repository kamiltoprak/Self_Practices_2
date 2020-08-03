package JetBrains.ForLoop;
import java.util.Scanner;
public class FindfirstletterNondublicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter word");
        String str=scan.nextLine();
        for(int i=0; i<=str.length()-1;i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
