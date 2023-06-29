package prograss3;

import java.util.Scanner;

public class dgse {
    public static void main(String[] args) {
        long a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number in a milliseconds.");

        a= scanner.nextLong();

        long days=a/86400000;
        if(days>=1){
            a=a%86400000;
        }

        long hours=a/3600000;
        if(hours>=1){
            a=a%3600000;
        }

        long minutes=a/60000;
       if(minutes>=1){
           a=a%60000;
       }
        long seconds=a/1000;
        System.out.println(days+"  "+"days"+"  "+hours+":"+minutes+":"+seconds);



    }
}
