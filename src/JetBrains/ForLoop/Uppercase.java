package JetBrains.ForLoop;

public class Uppercase {
    public static void main(String[] args) {
        for(char word='A'; word<='Z'; ){
            System.out.print(" "+word);
            word+=1;
        }
    }
}
