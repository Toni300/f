package prograss3;

import java.util.Random;
import java.util.Scanner;

public class moon {
    public static void main(String[] args) {
        System.out.println("please enter num");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int num = in.nextInt();
        int out[] =new int[num];
        out[0]=13;
        for (int i=1;i< out.length;i++){
              out[i]= rand.nextInt();

        }



    }
}
