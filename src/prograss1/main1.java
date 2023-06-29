package prograss1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.println("please enter your number");
        x=scanner.nextInt();

        System.out.println("if you enter 1 your number will double." );
        System.out.println("if you enter 2 your number will add 10.");
        System.out.println("if you enter 3 your number will become negative.");
        y=scanner.nextInt();
        int a=x*2;
        int b=x+10;
        int c=x* -1;
        if(y==1){
            System.out.println("your number is "+a);
        }
        if(y==2){
            System.out.println("your number is"+b);
        }
        if(y==3){
            System.out.println("your number is"+c);
        }




    }
}
