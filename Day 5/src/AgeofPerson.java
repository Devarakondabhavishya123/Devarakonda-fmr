import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
class Person {
    String firstname;
    String lastname;
   LocalDate dob;
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;

    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String Adult(){

        if(getage(dob)>18){
            return "adult";
        }
        else{
            return "child";
        }

    }
    public int getage(LocalDate dob){
        LocalDate today = LocalDate.now();
        return Period.between(dob,today).getYears();

    }
    public void display(){
        System.out.println("firstname" + " " + firstname);
        System.out.println("lastname" + " " + lastname);
        System.out.println("dob" + " " + dob);
        System.out.println("age:" + Adult());
    }
}

public class AgeofPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastname = sc.nextLine();
        System.out.println("Enter DOB: ");
        LocalDate dob = LocalDate.parse(sc.nextLine());
        Person person = new Person();
        person.display();

    }
}
