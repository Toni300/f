package prograss1;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        int r, l, f;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        switch (r) {
            case (1) -> System.out.println("your dead by a zombie!");
            case (2) -> System.out.println("you have bean murder by a assassin.");
            case (3) -> {System.out.println("you managed to reach a fork in the road,choose your path again.");

                l = scanner.nextInt();
                switch (l) {
                    case (1):
                        System.out.println("you managed to rescue once again,keep your eyes open");
                        f = scanner.nextInt();
                        switch (f) {
                            case (1) -> System.out.println("you have been poisoned by a dangerous container.");
                            case (2) -> System.out.println("you managed to overcome all the obstacles,congratulation.");
                            case (3) -> System.out.println("you fell into a pool whit megalodons.");
                        }
                    case (2):
                        System.out.println("you've been electrocuted by a robotic gorilla.");
                        break;
                    case (3):
                        System.out.println("you fell into an endless abyss, goodbyes.");
                    default:
                        System.out.println("please enter a number between 1/2/3.");


                }
            }
        }
    }
}