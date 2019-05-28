package DB;

import java.util.ArrayList;
import java.util.Scanner;

public class Validate {

    private final static Scanner sc = new Scanner(System.in);
    
    //check menu range number
    public static int checkInputRange(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number in range.");
                System.out.print("Enter again");
            }
        }
    }

    //check Input String 
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Not empty");
                System.out.print("Enter again");
            } else {
                return result;
            }
        }
    }

    //check Input Integer
    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter positive number.");
                System.out.print("Enter again");
            }
        }
    }

    //check Doctor Exits by code
    public static boolean checkCodeExist(ArrayList<Doctor> ld, String code) {
        //check from first to last list doctor
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return true;
            }
        }
        return false;
    }
    
    // get Doctor By ID
    public static Doctor getDoctor(ArrayList<Doctor> ld, String id){
        for (Doctor doctor : ld){
            if (doctor.getCode().equalsIgnoreCase(id)){
                return doctor;
            }
        }
        return null;
    }
    
    //get Doctor by Name
    public static Doctor getDoctorByName(ArrayList<Doctor> ld, String name){
        for (Doctor doctor : ld){
            if (doctor.getName().equalsIgnoreCase(name)){
                return doctor;
            }
        }
        return null;
    }    
}
