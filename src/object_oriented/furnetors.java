package object_oriented;

public class furnetors {
    private int lenght;
    private int whidt;
    private int hight;
    private String material;

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWhidt(int whidt) {
        this.whidt = whidt;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public furnetors(int lenght, int whidt, int hight, String material) {
        this.lenght = lenght;
        this.whidt = whidt;
        this.hight = hight;
        this.material = material;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWhidt() {
        return whidt;
    }

    public int getHight() {
        return hight;
    }

    public String getMaterial() {
        return material;
    }
    public boolean surface(int lenght,int whidt,int hight,int matirial){
        if(whidt*lenght>=hight)
            return true;
        else {
            return false;
        }

    }
}

