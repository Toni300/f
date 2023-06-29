package object_oriented;

public class chair {
    private furnetors part1,part2,part3,part4,sf5,sf6;

    public furnetors getPart1() {
        return part1;
    }

    public furnetors getPart2() {
        return part2;
    }

    public void setPart1(furnetors part1) {
        this.part1 = part1;
    }

    public void setPart2(furnetors part2) {
        this.part2 = part2;
    }

    public void setPart3(furnetors part3) {
        this.part3 = part3;
    }

    public void setPart4(furnetors part4) {
        this.part4 = part4;
    }

    public void setSf5(furnetors sf5) {
        this.sf5 = sf5;
    }

    public void setSf6(furnetors sf6) {
        this.sf6 = sf6;
    }

    public furnetors getPart3() {
        return part3;
    }

    public furnetors getPart4() {
        return part4;
    }

    public furnetors getSf5() {
        return sf5;
    }

    public furnetors getSf6() {
        return sf6;
    }

    public chair(furnetors part1, furnetors part2, furnetors part3, furnetors part4, furnetors sf5, furnetors sf6) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.sf5 = sf5;
        this.sf6 = sf6;
    }

}
