package j1.s.p0052;

import java.util.ArrayList;

public class J1SP0052 {

    public static void main(String[] args) {
        ArrayList<Country> listCountry = new ArrayList<>();
        int choice;
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        
        while(true){
            choice = manager.menu();
            switch(choice){
                case 1:
                    manager.inputCountry(listCountry);
                    break;
                case 2:
                    manager.print(listCountry);
                    break;
                case 3:
                    manager.search(listCountry);
                    break;
                case 4:
                    manager.sort(listCountry);
                    break;
                case 5:
                    System.out.println("Exit.");
                    return;
            }
        }
    }    
}
