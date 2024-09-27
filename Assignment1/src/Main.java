import java.util.Scanner;

class Employee{
    int id;
    String name;
    float BasicSalary;
    float Bonus;
    float NetSalary;
    Employee(int id, String name, float BasicSalary){
        this.id = id;
        this.name = name;
        this.BasicSalary = BasicSalary;
        this.Bonus = 0;
        this.NetSalary =0;
    }
    public void NetSalary(){

    }
    public void Bonus(){

    }
    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee BasicSalary: " + BasicSalary);
        System.out.println("Employee Bonus: " + Bonus);
        System.out.println("Employee NetSalary: " + NetSalary);

    }


}
class PermanentEmployee extends Employee{
    int pf;
   public  PermanentEmployee(int id, String name, float BasicSalary,int pf){
        super(id,name,BasicSalary);
        this.pf = pf;
        NetSalary();
        Bonus();


    }
   public  void NetSalary(){
        NetSalary = BasicSalary - pf;
        //System.out.println(NetSalary);
    }
    public void Bonus(){
        if( pf < 1000){
            Bonus = 0.10f*BasicSalary;
            //System.out.println("Bonus is $"+Bonus);
        }
        else if(pf >= 1000 && pf < 1500){
            Bonus = 0.115f*BasicSalary;
            //System.out.println("Bonus is $"+Bonus);
        }
        else if(pf >= 1500 && pf < 1800){
            Bonus = 0.12f*BasicSalary;
           // System.out.println("Bonus is $"+Bonus);
        }
        else if(pf>=1800){
            Bonus = 0.15f*BasicSalary;
           // System.out.println("Bonus is $"+Bonus);
        }

    }


}
class TemporaryEmployee extends Employee{
    int DailyWages;
    int No_of_days;
   public TemporaryEmployee(int id, String name,int No_of_days,int Dailywages){
       super(id,name,Dailywages* No_of_days);
       this.No_of_days = No_of_days;
       this.DailyWages = Dailywages;
       NetSalary();
       Bonus();
   }
   public void NetSalary(){
        NetSalary = DailyWages*No_of_days;
       // System.out.println("NetSalary:"+NetSalary);
    }
    public void Bonus(){
        if(DailyWages < 1000){
            Bonus = 0.15f*NetSalary;
            System.out.println("Bonus:"+Bonus);
        }
        else if(DailyWages >= 1000 && DailyWages < 1500){
            Bonus = 0.12f*NetSalary;
            System.out.println("Bonus:"+Bonus);
        }
        else if(DailyWages >= 1500 && DailyWages < 1800){
            Bonus = 0.11f*NetSalary;
            System.out.println("Bonus:"+Bonus);
        }
        else if(DailyWages >= 1750){
            Bonus = 0.08f*NetSalary;
            System.out.println("Bonus:"+Bonus);
        }
       // System.out.println("Bonus:"+Bonus);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Employee emp = new Employee();

        //per.display();
        System.out.println("Employee id:");
        int id = sc.nextInt();
        System.out.println("Employee name:");
        String name = sc.next();
        System.out.println("Employee BasicSalary:");
        float BasicSalary = sc.nextFloat();
        System.out.println("Employee pf:");
        int pf = sc.nextInt();
        PermanentEmployee per = new PermanentEmployee(id,name,BasicSalary,pf );
        per.display();
        System.out.println("employe id:");
        int temid = sc.nextInt();
        System.out.println("employe name:");
        String temname = sc.next();
        System.out.println("employe dailywages:");
        int dailywages = sc.nextInt();
        System.out.println("employe no_of_days:");
        int no_of_days = sc.nextInt();

        TemporaryEmployee tmp = new TemporaryEmployee(temid,temname,dailywages,no_of_days);
        tmp.display();
    }
}




