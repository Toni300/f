package prograss3;

public class recursion1 {
   public static void recursion (String str,int n){
        if(n >= str.length()) {
            return;
        }
            System.out.print(str.charAt(n));
            recursion(str, n + 1);

        }


    public static void main(String[] args){
       String str="hello world";
       recursion(str,0);

    }
}



