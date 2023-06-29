package filePrograming;

import java.util.Random;
import java.util.Scanner;

public class blackjack {
    public static int pop() {
        Random rand = new Random();
        int card = rand.nextInt(1, 13);

        if (card == 11) {
            card = 10;
            System.out.println("you get a prince");
        } else if (card == 12) {
            card = 10;
            System.out.println("you get a quine");
        } else if (card == 13) {
            card = 10;
            System.out.println("you get a king");
        } else if (card == 1) {
            card = 11;
            System.out.println("you get a ace");
        } else {
            System.out.println("the number is " + card);
        }
        System.out.println("------------------------");
        return card;
    }

    public static int pol(int sdcard,int dscard) {

        if (sdcard == 21) {
            System.out.println("you win bitch congratulation");
            return 1;
        }
        if (sdcard > 21) {
            System.out.println("you lose man,but look on the brith side, if you play again - your chances are gonna be higher!");
            return 2;
        } else {
            System.out.println("the sum of your numbers is " + sdcard);
            return 3;


        }



    }

    public static int pok() {
        Scanner scan =new Scanner(System.in);

        System.out.println("if you want to get another card please press 1");
        System.out.println("if you want to hold your card just press 2");



        return scan.nextInt();

    }




    public static void main(String[] args) {
        System.out.println("welcome to filePrograming.blackjack,you are getting 2 cards and you have to play smart,please enjoy your staying!");
        int card1;
        int card2;
        int sdcard;
        int dscard;
        card1 = pop();
        card2 = pop();
        int flag=1;
        sdcard = card1 + card2;
        dscard = card1 + card2;


        while ((pol(sdcard,dscard) > 2 && flag==1)){
            switch (pol(sdcard,dscard)) {
                case 1:


                    return;

                case 2:
                    return;


                case 3:
                    flag = pok();

            }

            if (flag == 1){
                sdcard += pop();
            }



        }

    }
}




