package prograss3;

import java.util.Scanner;

public abstract class testtraining {
    public static void main(String[] args) {
        int AmountNumbers = 0;
        int PositiveNumbers = 0;
        int EvenNumbers = 0;
        Scanner scan = new Scanner(System.in);
        int z = 0;
        System.out.println("please enter a numbers");
        do {
            z = scan.nextInt();
            AmountNumbers++;
            if (z >= 0)
                PositiveNumbers += z;
            if (z % 2 == 0)
                EvenNumbers++;
        } while (z != 0);
        System.out.println("the Amount of numbers is... " + AmountNumbers);
        System.out.println("the Sum of positive numbers is... " + PositiveNumbers);
        System.out.println("the Amount of even numbers are..." + EvenNumbers);

    }

}

//    int num=12345;
//
//    abstract what(num) ;
//
//    }
//
//    public static int what(int num)
//    {
//        int c = 0;
//        while (num > 0)
//        {
//            c += (num % 2);
//            num /= 10;
//        }
//        return c;
//    }
//    public static void why()
//    {
//        int[] arr = {1245, 34781, 23, 468, 139 };
//        int res = arr[0];
//        for (int i = 1; i < arr.length; i++)
//        {
//            if (what(arr[i]) < what(res))
//            {
//                res = arr[i];
//            }
//        }
//        System.out.println(res);
//    }
//}
