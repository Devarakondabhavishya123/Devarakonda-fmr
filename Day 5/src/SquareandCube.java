import java.util.Scanner;
class shape{
    double num;
    static double FindSquare(double n){
       // this.num = num;
        double square = n*n;
        return square;



    }
     static double FndCube(double n){
        double cube = n*n*n;
        return cube;
    }
}
public class SquareandCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        shape sh = new shape();
        System.out.println("Square of number is  :"+ sh.FindSquare(num)  );
        System.out.println("cube of number is  :"+ sh.FndCube(num));
    }
}
