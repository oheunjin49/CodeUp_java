package no_1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        int num = Integer.parseInt(a, 16);

        for(int i=1; i<16; i++){
           String num1 = Integer.toHexString(i).toUpperCase();
           String num2 = Integer.toHexString(i*num).toUpperCase();
           System.out.println(a+"*"+num1+"="+num2);
        }
    }
}
