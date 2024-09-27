import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Registrationform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Enter the name:" );
        String name = sc.nextLine();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the Country:");
        String country = sc.next();
        System.out.println("welcome "+name+".Your age is "+age+" and you are from "+country);


    }
}