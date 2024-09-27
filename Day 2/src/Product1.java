public class Product1 {
     int proid;
     String proname;
     int price;
    public Product1(int proid, String proname, int price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;

    }
    void display() {
        System.out.println(proname + " " + price+ " " + proid);
    }
    public static void main(String[]args) {
        Product1 p1 = new Product1(1, "Milk", 100);
        Product1 p2 = new Product1(2, "pen", 10);
        p1.display();
        p2.display();
        Product1 p3 = new Product1(3, "bottle", 150);
        Product1 p4 = new Product1(4, "comb", 500);
        p3.display();
        p4.display();
    }
}
