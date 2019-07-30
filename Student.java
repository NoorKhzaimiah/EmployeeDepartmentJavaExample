 
package empdepubs;
 
public class Student extends Person {
  
  
   private int empid ;
   private Department department;

    public Student(  int empid, int id, String name) {
        super(id, name);
 
        this.empid = empid;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
     
 
}
