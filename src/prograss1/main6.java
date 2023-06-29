package prograss1;

public class main6 {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
       for  (int x=0;x<10;x++){
           c=a+b;
           a=b;
           b=c;
           System.out.println(c);
        }
        System.out.println("");
    }
}
