
package j1.s.p0063;

public class Manager {
    
    public static void display(Person[] listPerson){
        for (int i = 0; i < listPerson.length; i++){
            System.out.println(listPerson[i]);
        }
    }
    
    public static void addPerson(Person[] listPerson){
        for (int i = 0; i < listPerson.length; i++){
            System.out.println("Enter name: ");
            String name = Validate.checkString();
            System.out.println("Enter address: ");
            String address = Validate.checkString();
            System.out.println("Enter salary: ");
            int salary = Validate.checkSalary();
            listPerson[i] = new Person(name, address, salary);
        }
    }
    
    public static void sort(Person[] listPerson){
        for (int i = 0; i < listPerson.length - 1; i++){
            for (int j = i; j < listPerson.length; j++)
            if (listPerson[i].getSalary() > listPerson[j].getSalary())
                swap(listPerson[i], listPerson[j]);
        }
    }
    
    private static void swap(Person a, Person b){
        String name = a.getName();
        String address = a.getAddress();
        int salary = a.getSalary();
        
        a.setName(b.getName());
        a.setAddress(b.getAddress());
        a.setSalary(b.getSalary());
        
        b.setName(name);
        b.setAddress(address);
        b.setSalary(salary);
    }
}
