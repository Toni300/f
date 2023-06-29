package prograss2;//import java.util.Random;
//import java.util.Scanner;

public class lesson8 {

    /*public static void main(String[] args) {


        System.out.println("please enter to numbers to the program!");
        int[] arr = new int[2];
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        Scanner scan = new Scanner(System.in);
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();

        while (arr[0] * -1 != arr[1]) {
            count = count + 2;
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();


            if (arr[0] == arr[1]) {
                count1++;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]> 0) {
                    count2+=arr[i];

                }
            }
        }
        System.out.println(count+" numbers are absorbed in the program");
        System.out.println("the numbers of the positive is "+count2);
        System.out.println("the numbers of equals pairs is "+count1);


    }
}







    /*public static void prograss3.moon(int[] arr, int sum) {
        Random rand = new Random();
        rand.nextInt();
        System.out.println("the array that you made are: ");
        for (int i = 0; i < sum; i++) {
            if (10 <= arr[i] && arr[i] <= 99) {
                continue;
            }
            break;
            System.out.println("please try a positive number");
            {
                if (arr[i] / 10 > arr[i] % 2) {
                    continue;
                }
                System.out.println(arr[i]);

            }

        }

        public static void main (String[]args){

            Scanner scan = new Scanner(System.in);
            System.out.println("please enter a number!");
            int x = scan.nextInt();
            arr = new int[x];
            if (x > 0) {
                System.out.println("you chose the number " + x);
                arr = new int[x];


            } else {
                System.out.println("please try a positive number");
            }

            for (int i = 0; i < x; i++) {
            }

            prograss3.moon(arr, arr.length);

        }


    }
}


     */
    /*
    public static boolean func(int[] arr, int sum, int sum1) {
        if (arr.length < 4 || arr.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        for (int i = arr.length / 2; i <= arr.length - 1; i++) {
            sum1 += arr[i];

        }
        if (sum == sum1) {
            return true;
        }
        return false;
    }


    /*
        public static void main(String[] args) {
            int [] arr={-9,-6,7,9,0};
            int sum=0;
            int sum1=0;
            for(int i=0;i< arr.length;i++){
                if(arr[i]<0){
                    System.out.println("sorry the numbers are incorrect,please try another numbers in the array");
                    return ;
                }

            }

            System.out.println(func(arr,sum,sum1));
        }


     */


    /*
    public static int func1(int[] arr, int num) {


        int flag = -1, flag2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                flag = i;
                break;
            }
        }
        if (flag == -1) {
            return -1;
        }
        for (int k = arr.length - 1; k > 0; k--)
            if (num == arr[k]) {
                flag2 = k;
                break;
            }
        return flag + (arr.length-flag2);

    }






public static void main(String[] args) {
    int [] arr={4,10,13,71,10,10,71,71,2,10};
    int num=71;
    func1(arr,num);
    System.out.println();
}


    }

     */
    /*public static int func2(int[] arr) {
        int

    }
    public static void main(String[] args) {
        int[] arr = {20, 19, 7, 5, 5, 2, 19, 20, 7, 0};
        func2(arr);
    }
9
     */
}

