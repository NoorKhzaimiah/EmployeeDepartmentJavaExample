 
package empdepubs;
 
import java.util.ArrayList;

public class EmpDepUBS {
    
 public static void main(String[] args) {
 System.out.println("**** Start ****");
ArrayList <Employee> Emp = new ArrayList<Employee> ();
 Employee e ;
 /////////////
for (int i = 0 ; i<5 ; i++){
     //  e = new Employee(i , "Employee "+i+" Name",5000 );
       //Emp.add(e);}
/////////////
//for (int i = 0 ; i<5 ; i++){
       System.out.println(Emp.get(i).getName());
      }
 
///////////

  Department d = new Department (1 , "Department one " , Emp);
   System.out.println(d.getEmployees());
   
  System.out.println("**** Finished ****");
}
}