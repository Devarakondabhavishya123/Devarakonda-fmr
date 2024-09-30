import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String message){
        super(message);



    }
}
class Employee{
    private String id;
    private String name;
    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class EmpMangement {
    private List<Employee> employees;

    public  EmpMangement() throws EmployeeNotFoundException {
        employees = new ArrayList<>();
        employees.add(new Employee("e1","bhav" ));
        employees.add(new Employee("e2","deva" ));
        employees.add(new Employee("e3","abhi" ));

    }

    public Employee findemployee(String id) throws EmployeeNotFoundException{
        for(Employee emp : employees){
            if(emp.getId().equals(id)){
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee id:" + id+ "not found");

    }
    public static void main(String[] args) throws EmployeeNotFoundException {



        // public void main(String[] args) throws EmployeeNotFoundException {
        EmpMangement empm = new EmpMangement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id:");
        String id = sc.nextLine();
        try {
            Employee emp = empm.findemployee(id);

            System.out.println("employee found:" + emp.getName());
        }
        catch(EmployeeNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }

    }


}



