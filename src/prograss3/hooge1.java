package prograss3;

import object_oriented.hooge;

public class hooge1 {
    public static void main(String[] args) {
        hooge h1=new hooge("pop",66);
        h1.print();
        System.out.println(h1.getBook());
        System.out.println(h1.getPrice());
        h1.setBook("fool");
        System.out.println(h1.getBook());
        h1.print();
    }
}
