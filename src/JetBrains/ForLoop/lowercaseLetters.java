package JetBrains.ForLoop;
//3. write a program that can print a~z
public class lowercaseLetters {
    public static void main(String[] args) {
        for(char word='a'; word<='z'; ){
            System.out.print(" "+word);
            word+=1;
        }

    }
}
