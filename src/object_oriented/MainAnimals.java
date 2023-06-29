package object_oriented;

public class MainAnimals {
    public static void main(String[] args) {
        Animals dog1 = new Animals();
        Animals cat1 = new Animals();

        catsimulat cat2 = new catsimulat();
        dogsimulat dog2 = new dogsimulat();
        Rottweiller actting = new Rottweiller();

        dog1.getDescribe();
        dog1.getSumlegs();
        dog1.setDescribe("loooli");
        dog1.setSumlegs(3);
        cat1.getSumlegs();
        cat1.getDescribe();
        cat1.setDescribe("summ");
        cat1.setSumlegs(3);


        dog2.bark();
//
//        dog1.describe="asci";
//        System.out.printf(dog1.describe + " \n");
//        dog1.sumlegs=4;
//        System.out.printf(dog1.sumlegs + " \n");
//        dog1.eat();
//        System.out.printf("\n");
//        System.out.printf("//---------------");
//        cat1.describe="siami";
//        System.out.printf(cat1.describe + "\n");
//        cat1.sumlegs=4;
//        System.out.printf(cat1.sumlegs + " \n");
//        cat1.eat();
//        System.out.printf("\n");
//        System.out.printf("//---------------");
//        System.out.printf("\n");
//        dog2.bark();
//        System.out.printf("\n");
//        cat2.meow();
//        System.out.printf("\n");
//        System.out.printf("//---------------");
//        System.out.printf("\n");
//        actting.isdengerous();
//        System.out.printf("\n");
    }




}
