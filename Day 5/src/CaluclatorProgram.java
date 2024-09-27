import java.util.Scanner;

class Caluclator{
    public int Addition(int a,int b){
        return a+b;

    }
    public int Subtraction(int a,int b){
        return a-b;

    }
    public int Multiplication(int a,int b){
        return a*b;


    }
    public int Division(int a,int b){
        return a/b;
       // int remainder = a % b;
      // remainder= (int)a/b;

       // return Quotient;
       // return remainder;
    }


}




public class CaluclatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caluclator cal = new Caluclator();
        System.out.println("Enter the operator:");
        String op = sc.nextLine();
        switch(op){
            case "add":
               // System.out.println();
                System.out.println("Enter the first number:");
                int a = sc.nextInt();
                System.out.println("Enter the second number:");
                int b = sc.nextInt();
                int re =cal.Addition(a,b);
                System.out.println("Result of addition is: "+re);
                break;
            case "sub":
                System.out.println("Enter the first number:");
                int c = sc.nextInt();
                System.out.println("Enter the second number:");
                int d = sc.nextInt();
                int re2 =cal.Subtraction(c,d);
                System.out.println("Result of subtraction is: "+re2);
                break;
            case "mul":
                System.out.println("Enter the first number:");
                int m = sc.nextInt();
                System.out.println("Enter the second number:");
                int n = sc.nextInt();
                int re3 =cal.Multiplication(m,n);
                System.out.println("Result of multiplication is: "+re3);
                break;
            case "div":
                System.out.println("Enter the first number:");
                int s = sc.nextInt();
                System.out.println("Enter the second number:");
                int e = sc.nextInt();
                double re4=cal.Division(s,e);
                System.out.println("Result of division is: "+re4);
                break;
                default:
                    System.out.println("invalid");
        }
    }

}
