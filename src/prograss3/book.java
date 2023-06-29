package prograss3;//import java.util.Scanner;

public class book {
    /*
    public static void main(String[] args) {
        String string1;
        String string2;
        System.out.println("please enter your first S");
        Scanner scan=new Scanner(System.in);
        string1= scan.next();
        System.out.println("please enter the second S");
        Scanner scan1=new Scanner(System.in);
        string2=scan1.next();


        func(string1,string2);

    }




    public static float  func(String string1,String string2) {
        int error = 0;
        int correct = 0;
        int siz=string1.length();
        if (string1 != string2)
            return 0;

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == string2.charAt(i))
                correct++;
            else {
                error++;
            }


        }
        if (correct == string2.length()){
            System.out.println("the two S are the same");
        return 1;
    }
        else {
            System.out.println("there are some diffrance between the S that up on..." + error);
        }
        return (float) ((error*siz)/100.0);
    }

}




    public static void main(String[] args) {
        String string2 = "hello humans";
        int i = 0;
        func1(string2, i);


    }

    public static void func1(String string2, int i) {
        while (string2.length() > 0) {
            System.out.println(string2.charAt(i));
            func1(string2,i+1);
        }

    }


    public static void main(String[] args) {
        String string3="hello humans welcome to my world";
        int counter=0;
        int i=0;
        func2(string3,counter,i);
        System.out.println(counter);
    }

    public static void func2(String string3,int counter,int i) {
        if( i >= string3.length()){
            System.out.println(counter);
            return;
        }
        if (string3.charAt(i) == ' '){
            counter++;
        }
        func2(string3, counter, i+1);
    }
}



    public static void main(String[] args) {
        String string4="lolita is my futere loop";
        int r,l=string4.length();
        func3(string4,0,l);

    }
    public static void func3(String string4,int r,int l) {
        if (string4.length() == r)
            return ;

        if (string4.charAt(r) == string4.charAt(l))
            func3(string4, r + 1, l - 1);

        else
            return;
    }





       }

     */

    public static void main(String[] args) {
      String str5="Hello Its Me";
      int counter = 0;
      func4(str5,counter);

    }
    public static void func4(String str5,int counter) {
        if (str5.length() == counter)
            return;

        if (str5.charAt(counter) >= 'A' && str5.charAt(counter) <= 'Z') {
            if (str5.charAt(counter) == ' ')
                System.out.println(str5.charAt(counter + 1));
        }
            else if (str5.charAt(counter) == ' '){
                if (str5.charAt(counter) >= 'A' && str5.charAt(counter) <= 'Z')
                    System.out.println(str5.charAt(counter+1));
    }
            else{
            System.out.println(str5.charAt(counter));
        }


               func4(str5,counter+1);

        }

    }






