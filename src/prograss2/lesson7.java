package prograss2;//import java.util.Scanner;

import java.util.Random;

public class lesson7 {
    /*
    public static int zugi(int sum) {


        int counter=0;
        int j;

         while( sum > 0) {

            j=sum % 10;

            if (j % 2 == 0) {

                counter++;


            }
             sum=sum/ 10;


        }
        return counter;
    }



    public static void main(String[] args) {

        System.out.println("please enter a number");
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt();
        int plus = zugi(sum);
        System.out.println("in your number you have " + plus + "equals numbers");

    }
}
/*
    public static int zugi(int sum) {


        int counter = 0;
        int j;

        while (sum > 0) {

            j = sum % 10;

            if (j % 2 == 0 || j == 0) {

                counter++;


            }
            sum = sum / 10;


        }
        return counter;
    }


    public static void main(String[] args) {

        int arr[] = {1456, 3370, 1298, 7678, 5542,1212121};

        int temp = 0;

        int a=0;

       for (int i = 0; i < arr.length; i++) {

           int up = zugi(arr[i]);

           if (up > temp) {

               temp = up;

               a = i;

           }
       }
       System.out.println("the temp is "+temp);
        System.out.println(a);


    }

    */
   /* public static void temp(int [][] arr) {
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] % 2 == 0) {
                    counter++;
                }


            }


        }
        System.out.println("your equal number is reach to " + counter);

    }



//public static void test(int num){

   // System.out.println( num +"אנחנו כאן");
//}

    public static void main(String[] args) {
        Random rand = new Random();
        rand.nextInt();
        int [][] joue=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                joue[i][j]= rand.nextInt(1,99);
                System.out.print(joue[i][j]+"\t");


            }
            System.out.println();

        }



        temp(joue);







    }

    */
    /*
    public static void vol(int[] arr, int siz){
        Random bob =new Random();
        for(int i=0;i<siz;i++) {

        }

    }

    public static void main(String[] args) {
        int arr[] = new int [7];
        vol(arr,arr.length);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr());
        }

    }




     */

}



