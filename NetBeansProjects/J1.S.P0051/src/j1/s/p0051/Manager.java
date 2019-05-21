/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

import java.util.Scanner;

public class Manager {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.println("1. Normal Calculator.");
        System.out.println("2. BMI Calculator.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = checkInputRange(1, 3);
        return choice;
    }
    
    public static int checkInputRange(int min, int max){
        while (true){
            try{
                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max){
                    throw new NumberFormatException();
                }
                return n;
            }catch(NumberFormatException e){
                System.out.println("Please enter number of range.");
                System.out.print("Eneter again:");
            }
        }
    }
    
    public static double checkInputDouble(){
        while (true){
            try{
                double n = Double.parseDouble(sc.nextLine());
                return n;
            }catch(NumberFormatException e){
                System.out.println("Please enter double number. ");
                System.out.print("Enter again: ");
            }
        }    
    }
    
    public static String checkInputOperator(){
        while(true){
            String result = sc.nextLine().trim();
            if (result.isEmpty()){
                System.out.println("Must not empty");
            }else if(result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")){
                return result;
            }else{
                System.out.println("Please input(+,-,*,/,^)");
            }
            System.out.print("Enter again.");
        }
    }
    
    public static double inputNumber(){
        System.out.print("Enter number: ");
        double n = checkInputDouble();
        return n;
    }
    
    public void normalCalculator(){
        double memory;
        System.out.print("Enter number: ");
        memory = checkInputDouble();
        while(true){
            System.out.print("Enter operator: ");
            String operator = checkInputOperator();
            if(operator.equalsIgnoreCase("+")){
                memory += inputNumber();
                System.out.println("Memory : " + memory);
            }
            if(operator.equalsIgnoreCase("-")){
                memory -= inputNumber();
                System.out.println("Memory : " + memory);
            }
            if(operator.equalsIgnoreCase("*")){
                memory *= inputNumber();
                System.out.println("Memory : " + memory);
            }
            if(operator.equalsIgnoreCase("/")){
                memory /= inputNumber();
                System.out.println("Memory : " + memory);
            }
            if(operator.equalsIgnoreCase("^")){
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory : " + memory);
            }
            if(operator.equalsIgnoreCase("=")){
                System.out.println("Memory : " + memory);
                break;
            }
        }
    }
    
    public static String BMIStatus(double bmi){
        if (bmi < 19){
            return "Under Standard.";
        }else if(bmi >= 19 && bmi <= 25){
            return "Standard.";
        }
        return "Very fast- should be lose weight immediatly.";
    }
    
    public void BMICalculator(){
        System.out.print("Enter weight(kg): ");
        double weight = checkInputDouble();
        System.out.print("Enter height(cm): ");
        double height = checkInputDouble() / 100;
        double bmi = weight/(height*height);
        System.out.println("BMI: " + bmi);
        System.out.println("BMI status: "+ BMIStatus(bmi));
    }
}
