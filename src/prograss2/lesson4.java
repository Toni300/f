package prograss2;

import java.util.Random;

public class lesson4 {
    public static void main(String[] args) {
        /*
        int[][] arr = new int[][]{};
        Random rand = new Random();
        rand.nextInt();
        //מה שקורה כאן זה נקרא מערך דו מימדי שזה אומר שלכ אחד מן המערך הראשון יש מערך משלו ומגדירים את זה על ידי [],[]
        //שזה אומר שהצד שמאל הוא ראש המערך והשני הוא המערך שבתוכו דוגמא:
        //[]->[]->[]->[]->[]->[]->[]->[]->[]->[],
        //[]->[]->[]->[]->[]->[]->[]->[]->[]->[],
       // []->[]->[]->[]->[]->[]->[]->[]->[]->[],
        // []->[]->[]->[]->[]->[]->[]->[]->[]->[],
        // []->[]->[]->[]->[]->[]->[]->[]->[]->[],
        // []->[]->[]->[]->[]->[]->[]->[]->[]->[],

        for (int i = 0; i < arr.length; i++) {

            for (int y = 0; y < arr.length; y++) {

                arr[i][y]= rand.nextInt(1,3);
                System.out.print(arr[i][y] + "\t");
            }
            System.out.println( );
            //מה שעשינו כאן זה הגדרנו לו שיש משתנה שקוראים לו random מה שזה אומר תדפיס לי מספרים בצורה רנדומלית ואז נמשיך.


        }*/


        //arr[x][y]
        //arr[x - 1][y]


        int[][] arr = {{5, 4, 1, 0, 0, 3}, {1, 10, 7, 1, 123, 3}, {6, 1, 7, 0, 0, 2}, {1, 10, 21, 5, 5, 2}, {1, 10, 1, 10, 10, 1}};
        int num = 6;
        for (int i = 0; i < 5; i++) {
            for (int r = 0; r < 5; r++) {
                System.out.print(arr[i][r] + "  ");
            }
            System.out.println(" ");

        }

    }}

                /*if (arr[i - 1][r] == arr[i][r]) {
                    continue;
                }
                if (arr[i - 1][r - 1] == arr[i][r]) {
                    continue;
                }
                if (arr[i][r - 1] == arr[i][r]) {
                    continue;
                }
                if (arr[i + 1][r - 1] == arr[i][r]) {
                    continue;
                }
                if(arr[i + 1][r]==arr[i][r]) {
                    continue;
                }
                if(arr[i +1][r + 1]==arr[i][r]) {
                    continue;
                }
                if(arr[i][r + 1]==arr[i][r]) {
                    continue;
                }
                if(arr[i - 1][r + 1]==arr[i][r]) {
                    continue;
                }

                if(arr[i][r] == num){
                    System.out.println("true");
                    System.exit(0);
                }



                }



            }
        System.out.println("fails");


                /*for (int z = 0; z < i+2; z++){
                    for (int t = 0; t < r+2; t++){
                        if(i != z && r != t && arr[i][r] == arr[z][t]) {
                System.out.println(i + " " + r + " in: " + z + " "+t);

                 */










