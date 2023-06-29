package object_oriented;

public class object_oriented {

    /* private float _age = 0, _whight = 0, _hight = 0;

     private String name="shoun";

     public object_oriented.object_oriented(){
         this._age=0;
         this._hight=0;
         this._whight=0;
     }
     public object_oriented.object_oriented(float age,float whight,float hight,String name){
         this._age=age;
         this._hight=hight;
         this._whight=whight;
     }
     public float get_age() {
         return _age;
     }

     public float get_whight() {
         return _whight;
     }

     public float get_hight() {
         return _hight;
     }

     public void set_age(float _age) {
         this._age = _age;
     }

     public void set_whight(float _whight) {
         this._whight = _whight;
     }

     public void set_hight(float _hight) {
         this._hight = _hight;
     }
     public float bmi(){
             return (_whight/(_hight*_hight))   ;
     }
     public int levelrisk(float bmi) {
         if (bmi < 20)
             return 1;
         if (bmi > 20 && bmi < 25)
             return 2;
         if (bmi > 25 && bmi < 30)
             return 3;
         if (bmi > 30 && bmi < 40)
             return 4;
         if (bmi < 40)
             return 5;

         return 0;
     }


     public static void main(String[] args) {
         object_oriented.object_oriented goof = new object_oriented.object_oriented(19, 64, 1.75f, "toni");
         System.out.println(goof.bmi());
         System.out.println(goof.levelrisk(goof.bmi()));
     }



    private int _num1 = 0,_num2=0;

    public object_oriented.object_oriented(){
      _num1 = 0;
        _num2=0;
    }
    public  object_oriented.object_oriented(int num1,int num2) {
        _num1=num1;
        _num2=num2;
    }

    public int fibonachi(int a,int b,int num,int max,int i) {
        if (i == 1) {
            System.out.println(b);
        }
        if (max == i) {
            return 0;


            return 0;
        }

    /*public static void main(String[] args) {
        object_oriented.object_oriented pool=new object_oriented.object_oriented();

    }

     */


}



