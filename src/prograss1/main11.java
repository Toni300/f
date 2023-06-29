package prograss1;

public class main11 {
            public static void main(String[] args) {
                /* //אנחנו מנסים לעשות תןכנית שתכניס לנו את כל המספרים מ 0 עד 100 וברגע שנקבל את המספר שרצינו הוא יפסיק
                int i=0;



                while (i<100){
                    i++;
                    System.out.println(i);
            }
        }


                */
               /* for (int i = 0; i < 100; i++) {
                    //מה שקורה עכשיו זה שברגע שאתה מכניס את ה for אז הוא מבצע את המשימה ומעלה את ה i עד כמה שהגדרנו אותו וברגע שנוסיף את סימן ה break נוכל לקבוע מה יהיה גבול המיספור שלו
                    if (i == 5) {
                        break;
                    }
                    System.out.println(i);
                }
            }
        }
                */


                /* for (int x=0;x<100;x++){
                    for (int y=0;y<100;y++){
                        if (y==6){
                            System.out.println("break");
                            break;
                        }
                        System.out.println("x=");
                        System.out.println(x);
                        System.out.println("Y=");
                        System.out.println(y);
                    }
                }//מה שאנחנו עשינו כאן זה הצבנו לולאה שהיא לולאה בתוך לולאה שיש שני משתנים ושכל פעם אחד מהם מתקדם ברגע שהמשתנה השני מתאפס בגלל break ובכך אנחנו מגדירים ש
                // ברגע שהגענו למספר מסויים אז אנחנו "שוברים" אותו ואז מתחילים מהתחלה אבל המספר הראשון לא מתאפס ועולה עד שגם הוא נשבר
            }
        }




              //אנחנו עכשיו ניגע במושג של המילה continue שהיא אומרת לנו שאם יש לנו תנאי מסוים בוא מבטל אותו עד שהתנאי הראשון מסתיים לדוגמא:
      */

           /*     for (int q=0;q<100;q++){
                    if (q==3){
                        continue;
                    }
                    System.out.println(q);
                }

            }}

        */



       /*        //מה שאנחנו עשינו כאן זה משחק boom 7 שזה משחק שאומר שאסור שיופיעומ על הלוח התוצאות לא מספרים עם 7 ולא מספרים שהוא / ב=7 ולנסות

                for (int a = 0; a < 100; a++) {
                    if ((a % 10) == 7) {
                        System.out.println("boom");
                        continue;
                    }
                    if ((a % 7) == 0) {
                        System.out.println("boom");
                        continue;
                    }
                    if ((a / 10) == 7) {
                        System.out.println("boom");
                        continue;
                    }
                    System.out.println(a);


                }
*/


/*
               //אנחנו משתמשים בשיטת הדגל שמייצגת אם הסיפרה הנוכחית והסיפרה הבאה יוצרים את המספר הבא אם כן אז יש דגל טם לא אז לא(תלוי מה הגדרת):




          int flag=0;

                for(int a = 0; a < 100; a++) {
                    if ((a == 13) || (a == 101)) {
                        flag = 1;
                    }
                } }}


                  /*  }


                }
                if (flag==1){
                    System.out.println("poop");}
                else{
                    System.out.println("poop");

                }

             /* כאן ברצוננו לבדוק האם יש טעות בתוך המערכת על ידי זה שנאמר שדגל הוא טעות במערכת ואם יש דגל קיים אז יש טעות במערכת
                int sum=0;
                int flag=0;
                for(int a=0;a<=100;a++){
                    sum+=(a%10);
                    sum+=(a/10);

                    if (sum==9){
                        flag=1;
                    }

                }if (flag==1){
                    System.out.println("yes");
                }
                else{
                    System.out.println("nop");
                }

            }
        }
        */


            }}