 
package empdepubs;

import java.util.List;

 
public class Ensurance  {
    
    private List<benificary> family ;
    private int id ; 
    public Ensurance(List<benificary> family , int id) {
        this.family = family;
        this.id = id;
    }

    public List<benificary> getFamily() {
        return family;
    }

    public void setFamily(List<benificary> family) {
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
