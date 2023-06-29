package prograss2;

import java.util.Scanner;

//import java.util.Scanner;

public class lesson2 {
    /*
    public static void main(String[] args) {
          //מה שקורה כאן זה תרגיל של while שאומר תקח את המספר האחרון ב num ותוסיף אותו אל הספרה של num1 ובכך הוא יפזר את כל הספרות ויאחד אותם ל count ויחשב אותם
        int num=142498;
        int num1=0;
        while(num>0){
            num1+=num%10;
            num=num/10;
        }
        System.out.println(num1);
    }
}

         */
       /* //אנחנו עושים עכשיו את אתגר לוח הכפל ב - for/while.
        for (int a = 0; a <= 10; a++) {
            for (int b=0;b<=10;b++){
                System.out.println(a*b);
                System.out.println(" ");
        }}
    }}

        */
    /*

     */
        /*
        //דבר חדש שנלמד שהוא אומר שבמקום להמציא כל כך הרבה משתנחם אז אנחנו נשתמש ב arr בשביל להגדיר כמה נתונים נרצה לרשום את arr אבל השוני הוא בין arr לבין
        // הוא ששם אנחנו מגדירים מחדש את כל המשתנים שלנומ ואילו כאן אני עדיין באותו int אבל כאילו בתוך ספרייה אחת שלו שכולם חלק מאחד ואז אפשר להגדיק כל אחד בנפרד בלי להשתגע.
        int arr []= new int[10];
        for (int i=0;i<10;i++){
            arr[i]=i;
        }
        //for (int i=0;i<10;i++)
        System.out.println(arr[7]);
    }} */
       /* //כאן ה arr סוכם את כל המספרים ע"י sum
        int arr[]=new int [10];
        int sum =0;
        for (int i =0 ;i<10;i++){
            arr[i]=i;
        }
        for (int i =0 ;i<10;i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        }}

        */
        /* //דוגמא לאך לימצוא את המספר הכי גדול בתוך "הלוקרים"
        int arr[]=new int [10];
       // int sum =0;
        int max =0;
        arr[0]=24;
        arr[1]=1;
        arr[2]=6;
        arr[3]=223;
        arr[4]=0;
        arr[5]=75;
        arr[6]=34;
        arr[7]=9;
        arr[8]=5543;
        arr[9]=22;
        for (int i =0 ;i<10;i++){
            if (max<arr[i]){
                max=arr[i];
        }

    }
        System.err.println(max);
  }
}
         */
        /* //יש בעיה קטנה עם הדוגמא למעלה כי ברגע שנציב את הערכים בצורה של מינוסים אז מה שיצא זה שהוא יגדיר אותו במספר מעל ה 0 לדוגמא:
        int arr[]=new int [10];
        int max =0;
        arr[0]=-24;
        arr[1]=-1;
        arr[2]=-6;
        arr[3]=-223;
        arr[4]=-0;
        arr[5]=-75;
        arr[6]=-34;
        arr[7]=-9;
        arr[8]=-5543;
        arr[9]=-22;
        for (int i =0 ;i<10;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            //מה שקורא כאן זה ש max שלנו ממתחיל ב 0 אבל יש לנו עוד מספרים והוא לא רושם אותם אלא 0 והוא לא מופיע באף אחד מהם אז מה עלינו לעשות
        }
        System.err.println(max);
    }
}
*/


      /*  //בשביל לתקן את זה הגדרנו שהוא יביא שהי מספרים במקום להשוות עם ה 0 אז הוא ישווה בין שני מספרים אחרים ע"י הגדרה של ;[]max=arr
        int arr[]=new int [10];
        int max =0;
        arr[0]=-24;
        arr[1]=-1;
        arr[2]=-6;
        arr[3]=-223;
        arr[4]=-8 ;
        arr[5]=-75;
        arr[6]=-34;
        arr[7]=-9;
        arr[8]=-5543;
        arr[9]=-22;
        max=arr[0];
        for (int i =0 ;i<10;i++){
            if (max<arr[i]){
                max=arr[i];
            }

        }
        System.err.println(max);
        }


 }
    */


    /*     // [arr.length]זהו משתנה אשר מגדירים אותו נקבל את מספר arr שהגדרנו בנוסחה
        int arr[] = new int[10];
        int max = 0;
        arr[0] = 24;
        arr[1] = 1;
        arr[2] = 6;
        arr[3] = 223;
        arr[4] = 8;
        arr[5] = 75;
        arr[6] = 34;
        arr[7] = 9;
        arr[8] = 5543;
        arr[9] = 22;
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

     */


        /*
        int arr[] = new int[10];
        int max = 0;
        arr[0] = 24;
        arr[1] = 1;
        arr[2] = 6;
        arr[3] = 223;
        arr[4] = 8;
        arr[5] = 75;
        arr[6] = 34;
        arr[7] = 9;
        arr[8] = 5543;
        arr[9] = 22;
        max=(arr[0]-arr[1]);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]-arr[i+1]<max){
             max=(arr[i]-arr[i+1]);

            }
        }
        System.out.println(max);
        }}
         */

        /* //שאלת כיתה:כתוב תוכנית המקבלת מערך בגודל 8,ומחזירה את כל המספרים השלילים!
        int arr[]= new int[8];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            System.out.println("please enter number!");
            arr[i]=scanner.nextInt();


        }
        for (int i=0;i< arr.length;i++){
            if (arr[i]<0){
                System.out.println(arr[i]+ "this number are negative ");
            }
            // מה שעשינו כאן זה להכניס כאן קבלת מספר ע"י Scanner ואז אמרנו שהמספר המקבל הוא arr [i] ואז אנחנו אומרים לו שזה יהיה בלולאה ולא נצטרך לסמן את כולם
            //ואז אני אומר לו תעשה מחדש את הלולאה ואז תגדיר ב if שאם יש מספרים שהתקבלו שהם שלילים אז אני אומר לו להדפיס אותם בתור מספריים שלילים
        }

         */


    //פרויקט אישי עם המרצה משה פרקש:לקחנו שני משתנים כאן even/odd והוא יקח את המספרים הרנדומליים ואז יבדיל בין שני המשתנים אם הוא זוגי או לא ואז ירשום אותם
    //באותם המשתנים כל אחד בשורה יחודית.
     /*   int arr []={1,2,3,4,5};
        int even=0;
        int odd=0;
        System.out.print("this numbers are even: ");

        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){


                System.out.print(arr[i] + ", ");




            }




            }
        System.out.println();
        System.out.print("this number are odd: ");
        for(int x=0;x<arr.length;x++){
            if(arr[x]%2!=0){


                System.out.print(arr[x] + ", ");
            }



        }





    }}





    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
         for(int i=0;;i++){
             x= scan.nextInt();


         }


         }


    public static boolean func(int[] arr, int k, int temp) {


        if (k > 3 && k % 2 != 0) {

            temp = 1;

        }

        for (int i = 0; i < k / 2; i++) {
            if (arr[i] > arr[k / 2]) {

            }
            temp++;
        }
        for (int i = k / 2; i < k; i++) {
            if (arr[i] < k / 2) {

            }
            temp++;
        }

    }


    public static void main(String[] args) {
        int[] arr = {13, 21, 55, 11, 7, 2, 1};
        int k = arr.length;
        int temp = 0;

        func(arr, k, temp);

    }
    */

    /*
    public static void main(String[] args) {
        int number=1 ;
        int odd=2;
        number=odd;
        System.out.println(number);
    }


     */

}




























