package prograss2;//import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
      /*  for (int i=0;i<100;i++){
            if(i==50) {
              continue;
            }
            System.out.println(i);
            //יש לנו משימה של continue בלולאת for התהליך הוא שיש לנו ערך שאומר שהוא שווה 0 ואז אנחנו נותנים משימה ב for שכל זמן שהוא פחות מ 100 אז שיעלה
            //באחד ואז מגיעה if בשאלה האם המשתנה שלנו שווה 50 ואם גן אז שימשיך להדפיס את הערכים של i ואז מגיעה ההברה continue ואומרת
            // שתתעלם מהמטלה הבאה מה שאומר שהמטלה הבאה היא להדפיס את ערך i ואז מה שקורה הוא שואל ה if  האם הערך הוא שווה 50 וברגע שהוא כן שווה אז הוא מדלג על המשימה שאומרת להדפיס את הערך i ומדלגת על 50
        }  }} */



        /* //while= ברגע שיש לנו תנאי ולא ידוע לנו מתי הוא יסתיים נציב אותו
        int i=0;
        int temp=10;
        while((i>0)&&(temp==10)){
            System.out.println(i);
        }
        // מה שקורה כאן זה שהצבנו שאנחנו רוצים ששני התנאים יתקימו אצל while ואם הם מתקיימים אז שיעשה את ההדפסה ומה שקורה כאן זה שהצבנו ואז אין כאן שני תנאים קיימים לכן הוא לא מראה שום תשובה
}}
         */


       /* int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for (int x=0;x<=10;x++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        System.out.println(" ");
           פיבונצי אצל for המשימה היא להעביר את זה ל while//
   }
        */


        /*
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        while(a<=1000){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        System.out.println(" ");
    }}*/


       /* int i=0;
        do {
            System.out.println(i);
            i++;
        }while(i>0 && i<100);
        //מה שקןרה כאן נקרא do while שהסדר שלו הוא תלך מלמעלה למטה ואז תגיע ל while ותעשה את המשימה כדוגמא לעיל:

   }}
   */


        /*  int i=0;
        int sumNum=0;
        do {
            i++;
            sumNum+=i;
            System.out.print(" i=");
            System.out.println(i);
            System.out.println(sumNum);
        }while (sumNum<500);
        System.out.print("sumNum");
        System.out.println(sumNum);
        //מה שקורא כאן זה שאנחנו עושים שני משתנים אחד הוא הערך והשני הוא הסוכם ןאנחנו מבקשים שמה שהוא יעשה
    }}*/


        /* int num1=10;
        int num2=20;
        int op=Math.max(num1,num2);
        System.out.print(op);
        //שינוי לשון בגאבה אשר אומר שיש אפשרות גישה לחיפוש מקסימום ומינימום בתרגיל
    }}*/


        /*{{
        int num1=20;
        int num2=30;
        int num3=40;
        int dod=Math.min(num1,Math.min(num2,num3));
        double num=Math.abs(-2.878);
        System.out.println(num);
        */


        /* int num1=2;
        int num2=10;
        double gog=Math.pow(num1,num2);
        System.out.println(gog);
        //
         }}
         */


         /*
         {Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("please enter a number");
        num = scanner.nextInt();
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;


        }
        System.out.println(sum);

         */

       /*
       {Scanner scanner = new Scanner(System.in);
        int num=0;

        int sum=0;
        while (num==1){
            System.out.println( " num?");
            num=scanner.nextInt();
        }

        */
        /*Scanner scanner1 = new Scanner(System.in);

        int a=0;
        System.out.println("while");
        while ( a > 5){
            System.out.println("aa");

        }}}

         */
    }}






















