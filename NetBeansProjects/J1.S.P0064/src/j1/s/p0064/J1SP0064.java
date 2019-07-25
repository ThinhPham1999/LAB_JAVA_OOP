/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0064;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thinh
 */
public class J1SP0064 {
    
    
    private static final String EMAIL = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    private static final String PHONE = "[0-9]{10}";
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter emai:");
        String email = checkEmail();
        System.out.println("Enter phone: ");
        String phone = checkPhone();
        System.out.println("Enter date: ");
        Date date = checkDate();
        System.out.println(date);
    }
    
    
    public static String checkPhone(){
        while(true){
            String result = sc.nextLine().trim();
            if (result.matches(PHONE)){
                return result;
            }
            System.out.println("Enter again: ");
        }
    }
    
    public static String checkEmail(){
        while(true){
            String result = sc.nextLine().trim();
            if (result.matches(EMAIL)){
                return result;
            }
            System.out.println("Enter again: ");
        }
    }
    
    public static Date checkDate(){
        while(true){
            String result = sc.nextLine().trim();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            try{
                Date date = format.parse(result);
                return date;
            }catch(Exception ex){
                System.out.println("Please enter enter dd-mm-yyyy");
                System.out.println("Enter again: ");
            }
        }
    }
}
