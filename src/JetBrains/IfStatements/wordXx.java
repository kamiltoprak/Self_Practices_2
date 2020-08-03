package JetBrains.IfStatements;

import java.util.Scanner;

public class wordXx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";
        boolean start=word.charAt(0)=='x'||word.charAt(0)=='X';
        boolean end=word.charAt(word.length()-1)=='x'||word.charAt(word.length()-1)=='X';
        if(start && end){
            result=word.substring(1,word.length()-1);
        }else if(start){
            result=word.substring(1,word.length());
        }else if(end){
            result=word.substring(0,word.length()-1);
        }else{
            result=word;
        }

        System.out.println(result);
    }
}
