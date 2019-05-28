package j1.s.p0054;

import DB.Contact;
import java.util.ArrayList;

/**
 *
 * @author thinh
 */
public class J1SP0054 {

    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        
        while(true){
            int choice = Manager.menu();
            switch(choice){
                case 1:
                    Manager.createContact(lc);
                    break;
                case 2:
                    Manager.printAll(lc);
                    break;
                case 3:
                    Manager.deleteContactID(lc);
                    break;
                case 4:
                    System.out.println("Exit.");
                    return;
            }
        }
    }

}
