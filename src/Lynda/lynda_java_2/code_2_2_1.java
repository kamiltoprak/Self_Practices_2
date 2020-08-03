package Lynda.lynda_java_2;

public class code_2_2_1 {

    public static void main(String[] args) {
        int score = 1;
        String comment = score>=4? "Excellent job!":
                        score>=3? "Good job!":
                        score>=2?"Good try!":"fail";
        System.out.println(comment);
    }


}
