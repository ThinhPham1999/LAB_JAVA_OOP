package Manager;

import Entity.Fruit;
import java.util.ArrayList;
import java.util.Scanner;

public class Validate {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result > max && result < min) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please number in range (" + min + "," + max + ")");
                System.out.print("Enter again");
            }
        }
    }
    
    public static int checkInputInteger(){
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please number greater than 0.");
                System.out.print("Enter again");
            }
        }
    }
    
    public static String checkString(){
        while(true){
            String result = sc.nextLine();
            if (!result.isEmpty()){
                return result;
            }
            System.out.println("String must not empty.");
            System.out.print("Enter again: ");
        }
    }

    public static boolean checkExistedByName(String newFruit ,ArrayList<Fruit> listFruit){
        for (Fruit fruit : listFruit){
            if (newFruit.equals(fruit.getName())){
                System.out.println("Fruit is existed.");
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkExistedByid(String newFruitId ,ArrayList<Fruit> listFruit){
        for (Fruit fruit : listFruit){
            if (newFruitId.equals(fruit.getId())){
                System.out.println("Fruit is existed.");
                return true;
            }
        }
        return false;
    }
    
    public static String checkYesNo(){
        while(true){
            String result = sc.nextLine().trim();
            if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("N")){
                return result;
            }
            System.out.println("Please enter 'Y' or 'N'");
            System.out.print("Enter again: ");
        }
    }
}
