package prograss1;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("please enter a number.");
         long a;
        a=scaner.nextLong();
        long hours=a/3600000;
        if(a>=1){
            a=a%3600000;
        }
        long minutes=a/60000;
        if(a>=1){
            a=a%60000;
        }
        long seconds=a/1000;
        System.out.println("the time is "+hours+":"+minutes+":"+seconds);



    }
    }

