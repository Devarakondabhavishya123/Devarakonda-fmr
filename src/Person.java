 class person{
    private String name;
     int age;
    String Gender;
    public void setData(String name, int age, String Gender) {
        this.name = name;
        this.age = age;
        this.Gender = Gender;
    }
    public String getName(){
        return name;
    }
    public void displayDetails(){
        System.out.println("Name: " + getName()  + "Age: " + age + "Gender: "+ Gender);
    }
}
public class Person{
    public static void main(String[]args){
        person p = new person();
        p.setData("bhavishya",21,"female");
       p.displayDetails();



    }
}
