import java.util.Scanner;

public class concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 ;
        String name2 ;
        System.out.println("Enter the name1:");
        name1 = sc.nextLine();
        System.out.println("Enter the name2:");
        name2 = sc.nextLine();
        String fullname = name1 + " " + name2;
        System.out.println("Enter the full name: "+fullname);
        //System.out.println( name1.concat(name2));
        // name1.concat(name2)

    }
}
