package prograss2;

import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {
        int count =0,chartemp=0,countname=0;
        System.out.println("enter name"+ "");
        Scanner in= new Scanner(System.in);
        String str[] = new String[4];
        String st = "\n";
        for(int i=0;i< str.length;i++) {
            str[i] = in.next();
            str[i] = str[i].concat("\n");
        }
        for (int i=0;i< str.length;i++) {
            System.out.println(str[i]);
        }

            }
        }


