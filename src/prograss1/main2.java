package prograss1;

import javax.swing.*;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number that has three digits.");
        int a,b;
        a=scanner.nextInt();
        if((a/100==a/10)&&(a/10==a%10)){
            System.out.println("your number is equal.");}
        else if(a/10!=a%10){
            System.out.println("your number are odd.");}
            else
            System.out.println("try again.");





    }
}
