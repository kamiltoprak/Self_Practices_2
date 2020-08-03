package Lynda.lynda_java_2;

public class code_2_1_3 {
    public static void main(String[] args) {
        int score = 4;
        String message = new String();
        if (score >= 4){
            message = "Good job!";
        }else if (score < 4){
            message = "Decent job.";
        }
        System.out.println(message);
    }

}
