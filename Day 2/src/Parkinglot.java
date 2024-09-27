 class  Vehicle {
   public  int regnum;
   public String brand;
   public void calculate(){
        System.out.println("parking fee is 100");
    }
}
class Car extends Vehicle{

    int tyres;
    void ccalculate(){
        System.out.println("Car parking fee is 50");
    }


}
class Motorcycle extends Vehicle{
    int kick;
    void cccalculate(){
        System.out.println("Motor cycle parking fee is 10");
    }
}
public class Parkinglot {
    public static void main(String[] args) {
       // Vehicle v = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.calculate();
        motorcycle.calculate();
       // v.calculate();

    }
}
