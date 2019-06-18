
package j1.l.p0022;

import Entity.*;
import Manager.Manager;
import Manager.Validate;
import java.time.LocalDate;
import java.util.ArrayList;


public class J1LP0022 {

   
    public static void main(String[] args) {
        int choice;
        ArrayList<Experience> listExperience = new ArrayList<>();
        ArrayList<Fresher> listFresher = new ArrayList<>();
        ArrayList<Intern> listIntern = new ArrayList<>();
        
        while(true){
            choice = Manager.menu();
            switch(choice){
                case 1:
                    Manager.createExperience(listExperience);
                    break;
                case 2:
                    Manager.createFresher(listFresher);
                    break;
                case 3:
                    Manager.createIntern(listIntern);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    String name = Validate.checkInputString();
                    System.out.print("Enter type: ");
                    int type = Validate.checkInputLimit(0,2);
                    if (type == 0) Manager.searchExperience(listExperience, name);
                    if (type == 1) Manager.searchFresher(listFresher, name);
                    if (type == 2) Manager.searchIntern(listIntern, name);
                    break;
                case 5:
                    System.err.println("Exit");
                    return;
            }
        }
    }
    
}
