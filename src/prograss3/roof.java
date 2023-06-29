package prograss3;

import java.util.Scanner;

public class roof {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("please enter three angels.");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a+b+c==180) {
            System.out.println("congratulation you create a triangle.");
            if ((a == c) && (b == c) && (a == b)) ;
            System.out.println("wow is also equiangular");
        }
        else
            System.out.println("not a triangle");










 }
}
