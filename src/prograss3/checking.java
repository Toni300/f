package prograss3;

public class checking {
    public static void main(String[] args) {
//        String s = "A3BC12eDba";
//        int k=0;
//        what(s,k);
//    }
//        public static String what (String s,int k)
//        {
//            if (s.length() == k)
//                return "";
//            if (s.charAt(k) >= 'A' && s.charAt(k) <= 'Z')
//                return s.charAt(k) + what(s, k + 1);
//            if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z')
//                return what(s, k + 1) + s.charAt(k);
//            return what(s, k + 1);
//        }
//    }
    }
public static boolean brothers(int num1,int num2){
        int temp=num1%10;
        int temp2=num2%10;
        if(temp!=temp2){
            return false;
        }

        while (num1>0&&num2>0){
            num1/=10;
            num2/=10;

        }
        if (num1==num2)
            return true;
        return false;

}
    public static boolean what(int[] a, int []b)
    {
        for(int i=0; i < a.length; i++)
        {
            boolean flag = false;
            for(int k=0; k < b.length; k++)
            {
                if(brothers(a[i],b[k]))
                {
                    flag = true;
                }
            }
            if(!flag) return false;
        }
        return true;
    }
}