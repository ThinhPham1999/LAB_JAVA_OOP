package studentlist;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Validate {

    private static final Scanner sc = new Scanner(System.in);

    public static void checkFileExist(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            try {
                System.err.println("File not exist!");
                file.createNewFile();
                System.err.println("File created.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static String checkUpdateDelete(){
        while (true){
            String result = sc.nextLine().trim();
            if (result.equalsIgnoreCase("U") || result.equalsIgnoreCase("D")){
                return result;
            }
            System.out.println("Please enter U or D.");
            System.out.print("Enter again: ");
        }
    }

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter number in range. ");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (!result.isEmpty()) {
                return result;
            }
            System.out.println("String must not empty.");
            System.out.print("Enter again: ");
        }
    }

    public static int checkInputInteger() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter positive integer number.");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkExits(String studentId, ArrayList<Student> listStudent) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(studentId)) {
                return true;
            }
        }
        return false;
    }

    public static String checkInputCourse() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Java")) {
                return result;
            }
            if (result.equalsIgnoreCase(".Net")) {
                return result;
            }
            if (result.equalsIgnoreCase("C/C++")) {
                return result;
            }
        }
    }
}
