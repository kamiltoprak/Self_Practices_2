package Lynda.Lynda_Java_3;

public class Main {
        private String message = null;

        private Main(){
            String message = "default";
           // this(message);
        }

        private Main(String message){
            this.message = message;
        }

        public static void main(String[] args) {
            System.out.print(new Main().message);
        }
    }
