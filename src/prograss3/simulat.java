package prograss3;//import java.util.Scanner;

public class simulat {
    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        int count1=0;
//        int count2=0;
//        int count3=0;
//        int sum=0;
//        int x;
//
//        do {
//            System.out.printf("please enter a number");
//            count1++;
//             x= scan.nextInt();
//             if(x>0) {
//                 count3++;
//                 sum += x;
//             }
//
//            if(x%2==0)
//                count2++;
//
//            else
//                x= scan.nextInt();
//
//        }while (x!=0);
//        sum/=count3;
//        System.out.printf("the number of numbers that you put in is... " + count1 + "\n");
//        System.out.printf("the number of equals numbers that you puts in is... " + count2 + "\n");
//        System.out.printf("the avg of passitive numbers is " + sum + "\n" );
//    }
//    }
        int []arr= {12, 343, 567, 77, 43, 7};
        func(arr);
    }
    public static boolean func(int []arr) {
        if (arr.length < 3 || arr.length%2==0){
        return false;
    }
        for(int i=0;i< arr.length/2;i++){
            int j=arr.length/2;
            if(arr[j]>arr[i])
                return false;

        }
        for (int i=arr.length/2;i<arr.length;i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;


    }
}