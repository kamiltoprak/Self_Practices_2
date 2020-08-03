package Lynda.lynda_java_2;

public class code_2_3_2 {

    public static void main(String[] args) {
        int days = 0, month = 6;
        switch(month){
            case 1: case 3: case 5: case 6: case 7:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 30;
        }
        System.out.println(days);

        int  size=0, grade=5;
        switch (grade){
            case 1: case 2: case 3: case 4: case 5:
                size=25;
                break;
            case 6: case 7: case 8:
                size=30;
                break;
            default:
                size=32;
        }
        System.out.println("classroom Size:  \t\t\t"+size);
    }
}



