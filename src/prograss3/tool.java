package prograss3;

import java.util.Scanner;

public class tool {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter number between 1-99");
    int a;
    a = scanner.nextInt();
    if (a % 2 == 0) {
      System.out.println(a+"  is even");
    } else if (a % 2 != 0) {
      System.out.println(a+"  are odd");
    }
    if (a <= 10) {
      System.out.println(a+"  is a double digit.");
    } else if (a > 10) {

      System.out.println(a+"  is a single-digit.");
    }
    a = a % 10 + a / 10;
    if (a >= 10) {
      System.out.println(a+"  is bigger then 10");}
      else if (a > 10){
      System.out.println(a+" is less then 10");
    }







  }
}
