
package candidatesprogram;

public class Candidate{
    protected String idName;
    protected String name;
    protected String address;
    protected Area priorities;

    public Candidate() {
    }

    public Candidate(String idName, String name, String address, Area priorities) {
        this.idName = idName;
        this.name = name;
        this.address = address;
        this.priorities = priorities;
    }

    

    public String getIdName() {
        return idName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Area getPriorities() {
        return priorities;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPriorities(Area priorities) {
        this.priorities = priorities;
    }

    @Override
    public String toString() {
        return "idName=" + idName + ", name=" + name + ", address=" + address + ", priorities=" + priorities;
    }
    
    
 
}
