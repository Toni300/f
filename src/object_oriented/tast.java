package object_oriented;

import java.util.Scanner;

public class tast {
    public static void main(String[] args) {
        double num2 =0,num1=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("pleasde enter a hight");
        num1= scan.nextInt();
        System.out.println("please enter a whidth");
        num2=scan.nextInt();
        rectangle k = new rectangle();
        System.out.println(k.scope(num2,num1));
        System.out.println(k.area(num2,num1));
    }

}
