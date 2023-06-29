package object_oriented;

public class Animals {
    private String describe;
    private int sumlegs;

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public int getSumlegs() {
        return sumlegs;
    }

    public void setSumlegs(int sumlegs) {
        this.sumlegs = sumlegs;
    }

    public void eat(){
        System.out.printf("eat very well");
    }
}
