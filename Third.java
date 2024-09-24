// vote eligiblity
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wt is ur age");
        int age = sc.nextInt();

        if (age >18){
            System.out.println("You are eligble to vote");
        }
        else {
            System.out.println("You are not eligble to vote");}
    }
}
