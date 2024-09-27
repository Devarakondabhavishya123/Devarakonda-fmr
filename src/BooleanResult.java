import java.util.Scanner;

public class BooleanResult {
    public static void main(String[] args) {
        int x ;
        int y ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : " );
        x = sc.nextInt();
        System.out.println("Enter the value of y : " );
        y = sc.nextInt();
        System.out.println("Sample output:");
        if(x<y){
            boolean result = true;
            System.out.println("The reult of whether x is less than y is "+result);
        }
        else{
            boolean result = false;
            System.out.println("The reult of whether x is less than y is "+result);
        }
    }

}
