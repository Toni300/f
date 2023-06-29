package prograss3;

import java.util.Scanner;

public class doom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //this program put in a number between 18/45 and ask the person what there age if its age between the numbers
        System.out.println("welcome to are community please enter your age. ");
        int a;
        a=scanner.nextInt();
        if(a<=0){
            System.out.println("this number is un correct,please try again.");}
        else if((a>=18)&&(a<=45)) {
            System.out.println("congratulation, your hired.");
        }
            else{
            System.out.println("sorry,the jub position is already filled.");
        }






    }}
