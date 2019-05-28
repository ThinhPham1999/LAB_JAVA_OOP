
package j1.s.p0055;

import DB.Doctor;
import DB.Manager;
import java.util.ArrayList;


public class J1SP0055 {

    
    public static void main(String[] args) {
        int choice;
        ArrayList<Doctor> ld = new ArrayList<>();
        ld.add(new Doctor("01", "Le Thanh", "ABC", 1));
        while(true){
            choice = Manager.menu();
            switch(choice){
                case 1:
                    Manager.addDoctor(ld);
                    Manager.printAll(ld);
                    break;
                case 2:
                    Manager.updateDoctor(ld);
                    Manager.printAll(ld);
                    break;
                case 3:
                    Manager.deleteDoctor(ld);
                    Manager.printAll(ld);
                    break;
                case 4:
                    Manager.printAll(ld);
                    Manager.searchByName(ld);
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
            }
        }
    }
    
}
