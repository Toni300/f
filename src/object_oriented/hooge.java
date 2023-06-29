package object_oriented;

public class hooge {

    private String book="bob kol";
    private int price=98;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getPrice() {
        return price;
    }

    public hooge(String book, int price) {
        this.book = book;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.println(book);
        System.out.println(price);
    }
}
