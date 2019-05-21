
package j1.s.p0050;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Manager {
    private static final Scanner sc = new Scanner(System.in);
    public int menu(){
        System.out.println("1. Calculate Superlative Equation.");
        System.out.println("2. Calulate Quadratic Equation.");
        System.out.println("3.Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputRange(1,3);
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
    
    public static boolean checkOdd(double n){
        if (n % 2 == 0){
            return false;
        }
        return true;
    }
    
    public static boolean checkEven(double n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static boolean checkSquare(double n){
        if (Math.sqrt(n) * Math.sqrt(n) == n){
            return true;
        }
        return false;
    }
    
    public void superlative(){
        System.out.print("Enter a = ");
        double a = checkInputDouble();
        System.out.print("Enter b = ");
        double b = checkInputDouble();
        if (a == 0){
            System.out.println("No solution.");
            return;
        }       
        
        if (checkOdd(a)){
            System.out.println("a is odd.");
        }
        if (checkEven(a)){
            System.out.println("a is even.");
        }
        if (checkSquare(a)){
            System.out.println("a is square number");
        }
        
        if (checkOdd(b)){
            System.out.println("b is odd.");
        }
        if (checkEven(b)){
            System.out.println("b is even.");
        }
        if (checkSquare(b)){
            System.out.println("b is square number");
        }
        
        if (a == 0){
            System.out.println("No solution.");
            return;
        }
        double x = -b/a;
        System.out.println("Solution: "+ x);
    }
    
    public void quadratic(){
        System.out.print("Enter a = ");
        double a = checkInputDouble();
        System.out.print("Enter b = ");
        double b = checkInputDouble();
        System.out.print("Enter c = ");
        double c = checkInputDouble();
        
        if (checkOdd(a)){
            System.out.println("a is odd.");
        }
        if (checkEven(a)){
            System.out.println("a is even.");
        }
        if (checkSquare(a)){
            System.out.println("a is square number");
        }
        
        if (checkOdd(b)){
            System.out.println("b is odd.");
        }
        if (checkEven(b)){
            System.out.println("b is even.");
        }
        if (checkSquare(b)){
            System.out.println("b is square number");
        }
        
        if (checkOdd(c)){
            System.out.println("c is odd.");
        }
        if (checkEven(c)){
            System.out.println("c is even.");
        }
        if (checkSquare(c)){
            System.out.println("c is square number");
        }
        
        if (a == 0){
            double x = -c/b;
            System.out.println("Solution: "+ x);
            return;
        }
        
        double delta = b*b - 4*a*c;
        if (delta < 0){
            System.out.println("No solution.");
            return;
        }
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        double x2 = (-b - Math.sqrt(delta)) / (2*a);
        
        if (x1 == x2){
            System.out.println("One solution: " + x1);
            return;
        }
        
        if (x1 != x2){
            System.out.println("2 solution: ");
            System.out.println("x1 = "+ x1);
            System.out.println("x2 = " + x2);
        }
    }
}
