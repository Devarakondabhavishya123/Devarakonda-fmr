 class Plane {
    void takeoff(){
        System.out.println("Plane is taking off");
    }
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is landing");
    }

}
class cargoPlane extends Plane{
    void fly(){
        System.out.println("CargoPlane is flying at low ");
    }
    void carrycargo(){
        System.out.println("CargoPlane is carrying cargo");
    }
}
class PassegerPlane extends Plane{
    void fly(){
        System.out.println("PassegerPlane is flying at medium ");
    }
    void carryPassenger(){
        System.out.println("PassegerPlane is carrying passengers");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        PassegerPlane pp = new PassegerPlane();
        cp.takeoff();
        cp.fly();
        cp.carrycargo();
        pp.takeoff();
        pp.fly();
        pp.carryPassenger();
    }
}
