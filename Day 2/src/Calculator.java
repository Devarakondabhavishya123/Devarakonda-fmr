import java.util.Scanner;

abstract  class AreaCalculator {
    float area;
    abstract public void accInput();
      abstract public void  calcArea();
      public void displayArea(){
          System.out.println(area);
      }

}
class square extends AreaCalculator {
    float side;
    public void accInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        side = sc.nextFloat();
    }
    public void calcArea(){
        area = side * side;
    }
}
class rectangle extends AreaCalculator {
    float length;
    float breadth;
    public void accInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth: ");
        breadth = sc.nextFloat();

    }
    public void calcArea(){
        area = length * breadth;
    }

}
class circle extends AreaCalculator {
    float radius;
    public void accInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextFloat();
    }
    public void calcArea(){
        area = 3.141f*radius * radius;
    }
}

public class Calculator {
    public static void main(String[] args) {
        square s = new square();
        rectangle r = new rectangle();
        circle c = new circle();
        s.accInput();
        s.calcArea();
        s.displayArea();

        r.accInput();
        r.calcArea();
        r.displayArea();
        c.accInput();
        c.calcArea();
        c.displayArea();

    }
}