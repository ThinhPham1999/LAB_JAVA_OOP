
package j1.s.p0063;


public class Person {
    private String name;
    private String address;
    private int salary;

    public Person() {
    }

    public Person(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }
    
    
}
