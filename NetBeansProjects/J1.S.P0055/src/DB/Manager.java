
package DB;

import java.util.ArrayList;

public class Manager {
    public static int menu(){
        System.out.println("1. Add doctor.");
        System.out.println("2. Update doctor.");
        System.out.println("3. Delete doctor.");
        System.out.println("4. Search doctor.");
        System.out.println("5. Exit.");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputRange(1, 5);
        return choice;
    }
    
    //1. Add doctor
    public static void addDoctor(ArrayList<Doctor> ld){
        System.out.print("Enter code: ");
        String code = Validate.checkInputString();
        System.out.print("Enter name: ");
        String name= Validate.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = Validate.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validate.checkInputInt();
        //check code exits
        if (!Validate.checkCodeExist(ld, code)){
            ld.add(new Doctor(code, name, specialization, availability));
        }else{
            System.out.println("Code is exits, can't add.");
            return;
        }
        System.out.println("Add sucessful");
    }
    
    //2. Update doctor
    public static void updateDoctor(ArrayList<Doctor> ld){
        Doctor newDoctor = new Doctor();
        System.out.print("Enter enter id update: ");
        String idUpdate = Validate.checkInputString();
        if (Validate.checkCodeExist(ld, idUpdate)){
            newDoctor = Validate.getDoctor(ld, idUpdate);
        }
        else{
            System.out.println("Doctor not found.");
            return;
        }
        System.out.println("Set new code: ");
        String newCode = "";
        
        // check code exits
        while(true){
            newCode = Validate.checkInputString();
            if (Validate.checkCodeExist(ld, newCode)){
                System.err.print("Code is exits.");
                System.out.print("Enter code again: ");
            }
            else{
                break;
            }
        }
        System.out.print("Set new name: ");
        String newName = Validate.checkInputString();
        System.out.print("Set new specialization: ");
        String newSpecialization = Validate.checkInputString();
        System.out.print("Set new availability: ");
        int newAvailability = Validate.checkInputInt();
        
        // change infomation 
        newDoctor.setCode(newCode);
        newDoctor.setName(newName);
        newDoctor.setSpecialization(newSpecialization);
        newDoctor.setAvailability(newAvailability);
        
        System.out.println("Update sucessful");
    }
    
    //3. Delete doctor
    public static void deleteDoctor(ArrayList<Doctor> ld){
        System.out.print("Eneter code deleted: ");
        String codeDelete = Validate.checkInputString();
        if (!Validate.checkCodeExist(ld, codeDelete)){
            System.out.println("Code not exits.");
            return;
        }
        Doctor doctorDelete = Validate.getDoctor(ld, codeDelete);
        ld.remove(doctorDelete);
        
        System.out.println("Delete sucessful.");
    }
    
    //4. search doctor by name.
    public static void searchByName(ArrayList<Doctor> ld){
        System.out.print("Enter Name want to search: ");
        String nameSearch = Validate.checkInputString();
        Doctor doctorSearch = Validate.getDoctorByName(ld, nameSearch);
        //check doctor exits.
        if (doctorSearch == null){
            System.out.println("Not found.");
            return;
        }
        doctorSearch.display();
    }
    
    public static void printAll(ArrayList<Doctor> ld){
        System.out.printf("%-10s%-25s%-20s%-5s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor doctor : ld){
            doctor.display();
        }
    }
}
