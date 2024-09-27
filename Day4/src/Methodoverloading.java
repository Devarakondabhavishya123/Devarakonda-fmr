//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Calculator{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    static void add(int a, int b, int c){
        System.out.println(a+b);
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
       int n = cal.add(1,2);
        System.out.println(n);
       cal.add(5,6,7);



    }
}