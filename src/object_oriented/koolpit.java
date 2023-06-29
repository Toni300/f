package object_oriented;

import java.util.Random;

public class koolpit {
    public static void main(String[] args) {

//        int count=0;
//        int avg=0;
//        int coomp=0;
//        int sum=0;
//        Scanner scan= new Scanner(System.in);
//        int x= scan.nextInt();
//        do{
//            if (x%2!=0){
//                System.out.print("please enter a number !");
//                sum+=x;
//                while(x>0){
//                    coomp%=x;
//                    x/=10;
//                }
//                System.out.println("the some of the num is... "  + coomp);
//                count++;
//                x=scan.nextInt();
//                }
//            else {
//                count++;
//                sum+=x;
//                x=scan.nextInt();
//            }
//
//
//
//        }
//        while (x!=500);
//
//        avg=sum/count;
//
//        String s ="AELBPTA";
//        System.out.print(func5(s));
//    }
//        public static int func5(String s){
//        int a=0;
//        int flag=0;
//        int count2=0;
//        Scanner scan1=new Scanner(System.in);
//            do {
//                for(int i=0;i<s.length();i++){
//                    if(s.charAt(i)=='A') {
//                        if (s.charAt(i)==s.charAt(i+1)) {
//                            a++;
//                        }
//                        else {
//                            flag++;
//                            a++;
//                        }
//                    }
//                }
//
//                if(flag==2)
//                    count2++;
//                a++;
//
//            }while (a<23 || flag!=2);
//            return count2;

//        Scanner scan3 = new Scanner(System.in);
//        int[] x = new int[20];
//        Random rand = new Random();
//        do {
//            for (int i = 0; i < x.length; i++) {
//                x[i] = rand.nextInt();
//            }
//        } while (func6(x)==false);
//
//    }
//
//
//    public static boolean func6(int[] array) {
//        int count3 = 0;
//        int flag = 0;
//        if (array.length % 2 != 0)
//            return false;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j])
//                    count3++;
//            }
//            if (count3 == 1)
//                flag++;
//            else
//                return false;
//        }
//        if (flag == array.length / 2)
//            return true;
//        return false;


//    }
//    private String color;
//    private int width;
//    private int length;
//    private int high;
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getHigh() {
//        return high;
//    }
//
//    public void setHigh(int high) {
//        this.high = high;
//    }
//
//    public Random getRand4() {
//        return rand4;
//    }
//
//    public void setRand4(Random rand4) {
//        this.rand4 = rand4;
//    }
//
//    Random rand4=new Random();
//    public void box(String color,int width, int length,int high){
//        this.color="black";
//        this.width= rand4.nextInt(20,100);
//        this.length = rand4.nextInt(20,100);
//        this.high=rand4.nextInt(20,100);
//    }
//
//    public int WhatColor(){
//        if()
    }
//    Random rand5 = new Random();
//    private String color ;
//    private double weight;
//    private int width;
//    private int height;
//    private int length;
//
//
//    public object_oriented.koolpit(String color, double weight, int width, int height, int length) {
//        this.color = color;
//        this.weight = weight;
//        this.width = width;
//        this.height = height;
//        this.length = length;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//        public void print(){
//            System.out.println(length);
//            System.out.println(width);
//            System.out.println(height);
//        }
//        public static String heaviesBox(Box[] arr){
//        if (box1.length == 0)
//            return null;
//        object_oriented.koolpit
//        for(int i=1;i<box1.length;i++){
//            if(box1[i].getWeight()>toop)
//                toop=box1[i].getWeight();
//        }
//            return wincolor;
//        }

            public static boolean func7(int []a,int []b){
                int max=b[0];
                int min=a[0];
                for(int i=1;i<a.length;i++){
                    if(a[i]<min)
                        min=a[i];
                }
                for(int i=1;i<b.length;i++){
                    if(b[i]>max)
                        max=b[i];
                }
                if(min>max)
                    return true;
                
                return false;

            }
}


