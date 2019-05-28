package DB;

import java.util.Scanner;

public class Validate {

    private final static Scanner sc = new Scanner(System.in);
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";

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
    
    public static String checkInputPhone(){
        while(true){
            String result = checkInputString();
            if (result.matches(VALID_PHONE)){
                return result;
            }
             System.err.println("Please input Phone flow\n"              
                     + "• 1234567890\n"
                     + "• 123-456-7890 \n"
                     + "• 123-456-7890 x1234\n"  
                     + "• 123-456-7890 ext1234\n"
                     + "• (123)-456-7890\n"
                     + "• 123.456.7890\n" 
                     + "• 123 456 7890");
             System.out.print("Enter again: ");
        }
    }
    
    
}
