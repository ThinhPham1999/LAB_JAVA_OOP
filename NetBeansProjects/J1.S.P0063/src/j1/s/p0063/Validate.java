
package j1.s.p0063;

import java.util.Scanner;

public class Validate {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static int checkSalary(){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0 ) throw new NumberFormatException();
                return result;
            }catch(NumberFormatException ex){
                System.out.println("Please enter integer number greater than 0");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkString(){
        while(true){
            String result = sc.nextLine().trim();
            if (!result.isEmpty()){
                return result;
            }
            System.out.println("String must not empty");
            System.out.print("Enter again: ");
        }
    }
}
