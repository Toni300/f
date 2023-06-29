package prograss3;

class obor1 {
     static class drft {
       /* private int num1 = 0;


        private int num2 = 0;


        public drft() {
            this.num1 = 0;
            this.num2 = 0;
        }

        public drft(int d, int r) {
            this.num2 = r;
            this.num1 = d;
        }

        public drft(int r) {
            this.num2 = r;
        }

        public int prograss3.tool(int num) {
            return num;
        }

        public int coun() {
            return (num1>num2)? num1:num2;
        }

        public int sum(){
            return num1-num2;
    }
        public static void main(String[] args) {

            drft j = new drft(4,7);
            System.out.println(j.coun());
            System.out.println(j.prograss3.tool(41));
            System.out.println(j.sum());
        }
    }


    */

         private double num1 = 0;

         private double num2 = 0;

         private double num3 = 0;
         private double num4 = 0;

         public drft(int a, int b) {
             this.num2 = b;
             this.num1 = a;
         }

         public int area() {
             num3 = num1 * num2;
             num3 = num3 / 2;
             return (int) num3;
         }

         public int pitagoras(){
             int temp= (int) ((num1=num1*2)+(num2=num2*2));
             num4=Math.sqrt(temp);
             return (int) num4;

     }
         public int scope(){
             return (int) (num1+num2+num4);
         }

         public static void main(String[] args) {
             drft pick=new drft(3,7);
             System.out.println(pick.area());
             System.out.println(pick.pitagoras());
             System.out.println(pick.scope());

         }


     }
 }



