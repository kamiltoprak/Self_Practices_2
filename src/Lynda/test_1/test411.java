package Lynda.test_1;

public class test411 {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(Integer.toBinaryString(min));
        int too_small = min - 1;
        System.out.println(too_small);
        System.out.println('0'+Integer.toBinaryString(too_small));
    }
}
