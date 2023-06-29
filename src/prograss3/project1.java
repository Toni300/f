package prograss3;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        boolean cheking;
        System.out.println("please enter a number.");
        a=in.nextInt();
        cheking= (a%2==0);
        if(cheking==true){
            System.out.println("this number is even.");
        }else{
            System.out.println("this number isn't even");
        }
    }

}
