
package j1.s.p0054;

import DB.Validate;
import DB.*;
import java.util.ArrayList;

public class Manager {
    public static int menu(){
         System.out.println("1. Add a contact.");
         System.out.println("2. Display all contact.");
         System.out.println("3. Delete a contact.");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choice = Validate.checkInputRange(1, 4);
         return choice;
    }
    
    public static void createContact(ArrayList<Contact> l){
        System.out.print("Enter id contact: ");
        int contactid = Validate.checkInputInt();
        System.out.print("Enter fisrtName: ");
        String contactFisrtName = Validate.checkInputString();
        System.out.print("Enter lastName: ");
        String contactLastName = Validate.checkInputString();
        System.out.print("Enter Group: ");
        String contactGroup = Validate.checkInputString();
        System.out.print("Enter adress: ");
        String contactAdress = Validate.checkInputString();
        System.out.print("Enter phone: ");
        String contactPhone = Validate.checkInputPhone();
        
        l.add(new Contact(contactid, contactLastName, contactGroup, contactAdress, 
                contactPhone, contactLastName, contactLastName));
        System.err.println("Add sucessful.");
    }
    
    public static void printAll(ArrayList<Contact> l){
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        l.forEach((con) -> {
            con.display();
        });
    }
    
    public static void deleteContactID(ArrayList<Contact> l){
        System.out.print("Enter id: ");
        int idDelete = Validate.checkInputInt();
        Contact contactDelete = getContactByID(l, idDelete);
        if (contactDelete == null){
            System.err.println("Not found contact.");
            return;
        }else{
            l.remove(contactDelete);
        }
        System.err.println("Delete sucessful");
    }
    
    public static Contact getContactByID(ArrayList<Contact> l, int idDelete){
        for (Contact con : l){
            if (con.getID() == idDelete){
                return con;
            }
        }
        return null;
    }
}
