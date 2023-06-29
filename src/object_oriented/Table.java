package object_oriented;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        /*
        pstudent ptstudent = new pstudent();
        System.out.println("the avg of your exams is... "+ptstudent.avg());
        System.out.println("the num of test that you failed is..."+ptstudent.fails());


    }

         */
        Ttable pop=new Ttable();
        /*
        System.out.println("the color of the table is..."+pop.color);
        System.out.println("the number of legs on the table are..."+pop.legs);
        System.out.println("the id of the table is..."+pop.id);
        System.out.println("the model is..."+pop.model);



        System.out.println("the new color of the table are..."+pop.color);


         */
        int x;
        System.out.println("welcome to are store! if you will to press one you will get the details.if you press to you get two change the color of the table");
        Scanner scan=new Scanner(System.in);
        x= scan.nextInt();
        switch (x) {
            case 1: pop.Details();
            break;
            case 2: pop.Menu();
            break;
            default:
                System.out.println("please try a reasonable number");
                break;
        }
    }
}

