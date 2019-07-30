 
package empdepubs;
 
import java.util.List;

public class Employee extends Person{
 private float salary;
 
 private Department department;
 
 private  List<Ensurance> be ;  

    public Employee(float salary, Department department, List<Ensurance> be, int id, String name) {
        super(id, name);
        this.salary = salary;
        this.department = department;
        this.be = be;
    }

    public List<Ensurance> getBe() {
        return be;
    }

    public void setBe(List<Ensurance> be) {
        this.be = be;
    }

   


     

     public Department getDepartment() {
      return department;
   }

   public void setDepartment(Department department) {
      this.department = department;
   }
   

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
     
 

}


////////////////////////////
//import java.util.Scanner;
/* public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = in.nextInt();
    System.out.print("Enter the depid :: ");
  depid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + empid);
   System.out.println("Department id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }*/


