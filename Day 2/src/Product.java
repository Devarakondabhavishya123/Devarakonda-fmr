import java.util.Scanner;

public class Product {
    private int product_id;
    private String product_name;
    private String category;
    static String Storename = "fidelity";
    public void Initialize(int product_id, String product_name, String category) {
        this.product_id= product_id;
       this. product_name= product_name;
       this. category= category;
    }

    public void display() {
        System.out.println("Product ID: " + product_id+"product_name:"+product_name+"category:"+category);
    }
    public static void show(){
        System.out.println("storename: "+Storename);
    }




    public static void main(String[] args) {
        Product p = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        int product_id = sc.nextInt();
        System.out.println("Enter product name: ");
        String product_name = sc.next();
        System.out.println("Enter category: ");
        String category = sc.next();
        p.Initialize(product_id, product_name, category);
        p.display();
        Product.show();
    }
}
