package prograss2;

public class lesson6 {

   public static void  max(){
        int [] arr={3,6,8,3,5,9,19};
        int a=0;
        for(int i=0;i< arr.length;i++){
            if(a<arr[i]) {
                    a=arr[i];



            }
        }
        System.out.println(a);


    }

    public static void  minimum(){
       int [] arr={3,6,8,3,5,9,19};
       int a=0;
       for(int i=0;i< arr.length;i++){
           a=arr[0];
           if(a>arr[i]) {
              a=arr[i] ;
           }
       }
        System.out.println(a);


    }

    public static void main(String[] args) {
        minimum();max();
    }


    }







