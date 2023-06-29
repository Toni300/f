package prograss3;//import java.util.Scanner;

import java.util.Scanner;

public class Ttable {
  /*  int math=85;
    int english=100;
    int computer=54;
    String name="pop";

    public int avg(){
       int  temp=0;
        temp=math+english+computer;
        temp/=3;
        return temp;
    }
    public int fails(){
        int counter=0;
        if (math<56) {
            counter++;
        }
        if(english<56) {
            counter++;
        }
        if(counter<56) {
            counter++;
        }
          return counter;

    }




   */
  public void Details() {
    String color = "black";
    int legs = 4;
    int id = 2344509;
    String model = "geek italian";
    System.out.println("the color of the table is..."+color);
    System.out.println("the number of legs on the table are..."+legs);
    System.out.println("the id of the table is..."+id);
    System.out.println("the model is..."+model);

  }

  public void Menu() {
    String color="black";
    System.out.println("please enter the new color to your dream table");
    Scanner scan = new Scanner(System.in);
    color=scan.next();
    System.out.println("the new color of your table is..."+color);



  }
}


