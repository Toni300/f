package prograss1;//import java.util.Scanner;

//import java.util.Random;
//
//public class serr {
//    public static void main(String[] args) {
//
//    }
//    public static int func1(String  str){
//        int counter=0;
//        Scanner scan = new Scanner(System.in);
//        do{
//            if(str.charAt(0)=='Z' || str.charAt(str.length()-1)=='Z') {
//                counter++;
//                String x = scan.nextLine();
//            }
//            else {
//                String x = scan.nextLine();
//            }
//        }
//        while (str.charAt(0)  != 'A' && str.charAt(str.length()-1)!='A');
//
//        return counter;


//    public static boolean func2(int [] arr){
//        int count1=0;
//        int count2=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0)
//                return false;
//            if(arr[i]%2==0)
//                count1++;
//            else
//                count2++;
//        }
//        if(count1==count2)
//            return true;
//
//        return false;

//    }
//    public static boolean func3(String str1){
//        for(int i=0;i<str1.length()-1;i++){
//            if(str1.charAt(i)<='A' || str1.charAt(i)>='z')
//                return false;
//            for(int j=1;j<str1.length();j++){
//                if(str1.charAt(i)==str1.charAt(j))
//                    return false;
//
//            }
//        }
//        return true;
//    }


//        int k = 3;
//        int[] a = {4, 6, 2, 7};
//        int [] result=buildk(a, k);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print("");
//        }
//    }
//    public static int[] buildk(int[] a, int k) {
//        int[] array1 = new int[a.length * k];
//        int counter = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < k - 1; j++) {
//                array1[counter] = a[i];
//                counter++;
//            }
//        }
//        return array1;
//        int k=2;
//        int [] arr={2,3,4};
//        int [] brr={2,2,3,4,4,3};
//        System.out.print(func4(arr,brr,k));
//    }
//        public static int func4(int [] arr, int [] brr,int k){
//            int counter2=0;
//            for(int i=0;i<arr.length;i++){
//                for(int j=0;j<brr.length;j++){
//                    if(arr[i]==brr[j])
//                        counter2++;
//                }
//            }
//            if(arr.length*k!=counter2)
//                return 0;
//            return k;


//        int rows=9;
//        int columns=4;
//        int [][] array=new int[rows][columns];
//        Random rand =new Random();
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                array[i][j] =rand.nextInt();
//            }
//        }
//        System.out.print(matrix1(array));
//        }
//        public static int matrix1(int [][] array){
//        int spots=0;
//        int [] arr = new int[10];
//        for(int i=0;i<8;i++){
//            for (int j=0;j<3;j++){
//                if(array[i][j]==array[i+1][j])
//                    continue;
//                if(array[i][j]==array[i][j+1])
//                    continue;
//                if (array[i][j]==array[i+1][j+1])
//                    continue;
//                spots++;
//                arr[spots - 1] = array[i][j];
//
//
//            }
//        }
//        return spots;
//        }
//}
    import java.util.Random;

        public  class Main {
            public static void main(String[] args) {
                int rows = 9;
                int columns = 4;
                int[][] array = new int[rows][columns];
                Random rand = new Random();

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        array[i][j] = rand.nextInt();
                    }
                }

                System.out.print(matrix1(array));
            }

            public static int matrix1(int[][] array) {
                int spots = 0;
                int[] arr = new int[0];

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (array[i][j] == array[i + 1][j])
                            continue;
                        if (array[i][j] == array[i][j + 1])
                            continue;
                        if (array[i][j] == array[i + 1][j + 1])
                            continue;

                        spots++;
                        arr[spots - 1] = array[i][j];
                    }
                }

                return spots;
            }
        }


