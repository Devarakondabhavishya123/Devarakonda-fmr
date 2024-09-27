 class vehicle {
     void start(){
         System.out.println("vehicle is starting ");
     }
}
class jeep extends vehicle{
    void stop(){
        System.out.println("jeep is stopping  ");
    }
}
class ElectricCar extends jeep{
    void charge(){
        System.out.println("electricCar is charging ");
    }
}
public class Multilevel{
    public static void main(String[]args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.stop();
        electricCar.charge();


    }

}
