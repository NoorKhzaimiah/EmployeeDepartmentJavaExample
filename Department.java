 
package empdepubs;

import java.util.List;

public class Department {
      
    String name; 
    int id ;
 
    private List<Employee> employees ;

    Department(int id ,String name ,List<Employee> employees )  
    { 
        this.id = id ;
        this.name = name; 
     
       this.employees = employees;
               
    } 
 
    public List<Employee> getEmployees()  
    { 
        return employees; 
    } 
    
  

}