/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageEastAsiaCountries {
    private final static Scanner sc = new Scanner(System.in);
    
    // methoud
    public int menu(){
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit.");
        System.out.print("Enter your choice: ");
        int choice = checkInputRange(1, 5);
        return choice;
    }
     
    public void inputCountry(ArrayList<Country> listCountry){
        System.out.print("Enter code of country: ");
        String countryCode = checkInputString();
        if (checkContryExist(listCountry, countryCode)){
            System.out.println("Country is existed.");
            return;
        }
        
        System.out.print("Enter name of country: ");
        String countryName = checkInputString();
        System.out.print("Enter area: ");
        double countryArea = checkInputDouble();
        System.out.print("Enter countryTerrain: ");
        String countryTerrain = checkInputString();
        
        listCountry.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.out.println("Add successful.");
    } 
    
    public void print(ArrayList<Country> listCountry){
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
            "Terrain");
        listCountry.forEach((country) -> {
            country.display();
        });
    }
    
    public void search(ArrayList<Country> listCountry){
        boolean check = false;
        System.out.print("Enter name of country: ");
        String countryName = checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
            "Terrain");
        for (Country country : listCountry){
            if (countryName.equalsIgnoreCase(country.getCountryName())){
                country.display();
                check = true;
            }
        }
        if (!check){
            System.out.println("Not found.");
        }
    }
    
    public void sort(ArrayList<Country> listCountry){
        ArrayList<Country> newList = new ArrayList<>(listCountry);
        Collections.sort(newList);
        new ManageEastAsiaCountries().print(newList);
    }
    
    //function
    public static int checkInputRange(int min, int max){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n > max || n < min){
                    throw new NumberFormatException();
                }
                return n;
            }catch(NumberFormatException e){
                System.out.println("Please enter number in range.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkInputString(){
        while(true){
            String st = sc.nextLine().trim();
            if(st.isEmpty()){
                System.out.println("String must not empty.");
                System.out.print("Enter again: ");
                continue;
            }
            return st;
        }
    }
    
    public static double checkInputDouble(){
        while(true){
            try{
                double db = Double.parseDouble(sc.nextLine().trim());
                if (db <= 0){
                    throw new NumberFormatException();
                }
                return db;
            }catch(NumberFormatException e){
                System.out.println("Please enter positive real number.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static boolean checkContryExist(ArrayList<Country> listCountry, String countrycode){
        return listCountry.stream().anyMatch((coutr) -> (coutr.getCountryCode().equalsIgnoreCase(countrycode)));
    }
}
