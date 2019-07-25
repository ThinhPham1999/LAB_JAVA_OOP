
package j1.s.p0063;


public class J1SP0063 {

    public static void main(String[] args) {
        Person[] lisPersons = new Person[3];
        Manager.addPerson(lisPersons);
        Manager.display(lisPersons);
        System.out.println("");
        Manager.sort(lisPersons);
        Manager.display(lisPersons);
    }
}
