import java.sql.SQLOutput;
import java.util.Scanner;

abstract class Shape{
    float volume;
    abstract void  calcVolume();
    public void display(){
        System.out.println("VOLUME IS :" + volume  );
    }
}
class Cylinder extends Shape{
    int radius;
    int height;
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    void calcVolume() {


        float volume = 3.14f * radius * radius * height;
        System.out.println("VOLUME IS :" + volume);
    }
}
class Cube extends Shape{
    int side;
    public Cube(int side) {
        this.side = side;
    }
    void calcVolume() {
        float volume =  side * side * side;
        System.out.println("VOLUME IS :" + volume);
    }

}


public class Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the shape:");
        String sh = sc.nextLine();
        if(sh.equals("Cylinder")){
            System.out.println("Enter the radius :" );
            int radius = sc.nextInt();
            System.out.println("Enter the height :" );
            int height = sc.nextInt();
            Cylinder c = new Cylinder(radius, height);
            c.calcVolume();


        }
        else if(sh.equals("Cube")){
            System.out.println("Enter the Side :" );
            int side = sc.nextInt();
            Cube c = new Cube(side);
            c.calcVolume();
        }
    }
}
