package prograss2;

public class lessons9 {
  /*  public static void main(String[] args) {
        int len=0;
        String str="hello word";
        len=str.length();
        for(int i=0;i<len;i+=2){
            System.out.print(str.charAt(i));
            System.out.print("_");

        }
    }

         */

        /*
        int len=0;

        String str = "hello word";

        len = str.length();
        for (int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(len-1));
            len--;
        }



*/
        /*
        String str = "hello word";
        for (int i = 0; i <str.length()-1 ; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                }

            }


        }
*/

    /*public static void pik(int[] arr, int num) {

        int left = 0;
        int right = arr.length - 1;
        while (left != right) {
            if (arr[right] > num)
                right--;

            else {
                if (arr[left] < num)
                    left++;

                else {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
        }

        System.out.println(arr[left]);
        System.out.println(arr[right]);

    }

    public static void main(String[] args) {
        int[] arr = {4,2,8,9,6,19};
        int num = 4;
        pik(arr, num);
    }

     */

}
