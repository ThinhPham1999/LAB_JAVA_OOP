/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entity.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author thinh
 */
public class Manager {

    public static int menu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("Your choice: ");
        int choice = Validate.checkInputLimit(1, 5);
        return choice;
    }

    public static void createExperience(ArrayList<Experience> listExperience) {
        String con;
        do {
            System.out.print("Enter id: ");
            String id = Validate.checkInputString();
            System.out.print("Enter FirstName: ");
            String firstName = Validate.checkInputString();
            System.out.print("Enter LastName: ");
            String lastName = Validate.checkInputString();
            System.out.print("Enter BirthDate: ");
            int birthDate = Validate.checkInputYear();
            System.out.print("Enter Address: ");
            String address = Validate.checkInputString();
            System.out.print("Enter Phone: ");
            String phone = Validate.checkInputPhone();
            System.out.print("Enter Email: ");
            String email = Validate.checkInputEmai();
           
            System.out.print("Enter Year of Experience: ");
            int ExpInYear = Validate.checkExperience();
            System.out.print("Enter Professional Skill: ");
            String ProSkill = Validate.checkInputString();
            listExperience.add(new Experience(ExpInYear, ProSkill, id, firstName, lastName, birthDate, address, phone, email, 0));
            System.out.println("Do you want enter more: ");
            con = Validate.checkYesNo();
        } while (con.equalsIgnoreCase("Y"));
    }
    
    public static void createFresher(ArrayList<Fresher> listFresher){
        String con;
        do {
            System.out.print("Enter id: ");
            String id = Validate.checkInputString();
            System.out.print("Enter FirstName: ");
            String firstName = Validate.checkInputString();
            System.out.print("Enter LastName: ");
            String lastName = Validate.checkInputString();
            System.out.print("Enter BirthDate: ");
            int birthDate = Validate.checkInputYear();
            System.out.print("Enter Address: ");
            String address = Validate.checkInputString();
            System.out.print("Enter Phone: ");
            String phone = Validate.checkInputPhone();
            System.out.print("Enter Email: ");
            String email = Validate.checkInputEmai();
            
            System.out.print("Enter Graduated time ");
            Date Graduation_date = Validate.checkGraduationDate();
            System.out.print("Enter Rank of Graduation: ");
            String Graduation_rank = Validate.checkRank();
            System.out.print("Enter University: ");
            String University = Validate.checkInputString();
            listFresher.add(new Fresher(Graduation_date, Graduation_rank, University, id, firstName, lastName, birthDate, address, phone, email, 1));
            System.out.println("Do you want enter more: ");
            con = Validate.checkYesNo();
        } while (con.equalsIgnoreCase("Y"));
    }
    
    public static void createIntern(ArrayList<Intern> listIntern){
        String con;
        do {
            System.out.print("Enter id: ");
            String id = Validate.checkInputString();
            System.out.print("Enter FirstName: ");
            String firstName = Validate.checkInputString();
            System.out.print("Enter LastName: ");
            String lastName = Validate.checkInputString();
            System.out.print("Enter BirthDate: ");
            int birthDate = Validate.checkInputYear();
            System.out.print("Enter Address: ");
            String address = Validate.checkInputString();
            System.out.print("Enter Phone: ");
            String phone = Validate.checkInputPhone();
            System.out.print("Enter Email: ");
            String email = Validate.checkInputEmai();
          
            System.out.print("Enter Majors: ");
            String Majors = Validate.checkInputString();
            System.out.print("Enter Semester: ");
            int Semester = Validate.checkInputLimit(0, 20);
            System.out.print("Enter University: ");
            String UniversityName = Validate.checkInputString();
            listIntern.add(new Intern(Majors, Semester, UniversityName, id, firstName, lastName, birthDate, address, phone, email, 2));
            System.out.println("Do you want enter more: ");
            con = Validate.checkYesNo();
        } while (con.equalsIgnoreCase("Y"));
    }
    
    public static void searchExperience(ArrayList<Experience> listExperience, String name){
        boolean check = false;
        for (Experience ex : listExperience){
            if (containsIgnoreCase(ex.getFirstName(), name)
                    || containsIgnoreCase(ex.getLastName(), name)){
                System.out.println(ex);
                check = true;
            }
        }
        if (!check){
            System.out.println("Not found.");
        }
    }
    
    public static void searchFresher(ArrayList<Fresher> listFresher, String name){
        boolean check = false;
        for (Fresher f : listFresher){
            if (containsIgnoreCase(f.getFirstName(), name)
                    || containsIgnoreCase(f.getLastName(), name)){
                System.out.println(f);
                check = true;
            }
        }
        if (!check){
            System.out.println("Not found.");
        }
    }
    
    public static void searchIntern(ArrayList<Intern> listIntern, String name){
        boolean check = false;
        for (Intern i : listIntern){
            if (containsIgnoreCase(i.getFirstName(), name) || 
                    containsIgnoreCase(i.getLastName(), name)){
                System.out.println(i);
                check = true;
            }
        }
        if (!check){
            System.out.println("Not found.");
        }
    }
    
    private static boolean containsIgnoreCase(String st1, String st2){
        return st1.toLowerCase().contains(st2.toLowerCase());
    }
}
