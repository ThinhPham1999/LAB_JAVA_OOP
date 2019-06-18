/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thinh
 */
public class Validate {

private static final String EMAIL = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    private static final String PHONE = "[0-9]{10}";
    private static final Scanner sc = new Scanner(System.in);

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

    public static int checkInputYear() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 1900 || result > LocalDate.now().getYear()) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter year from 1900 to " + LocalDate.now().getYear());
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputEmai() {
        while (true) {
            String result = sc.nextLine().trim();
            if (!result.isEmpty() && result.matches(EMAIL)) {
                return result;
            }
            System.out.println("Please enter email follow fomat.");
            System.out.print("Enter again: ");
        }
    }

    public static String checkInputPhone() {
        while (true) {
            String result = sc.nextLine().trim();
            if (!result.isEmpty() && result.matches(PHONE)) {
                return result;
            }
            System.out.println("Please enter phone follow fomat.");
            System.out.print("Enter again: ");
        }
    }

    public static String checkRank() {
        while (true) {
            String result = sc.nextLine().trim();
            if (!result.isEmpty() || result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good") || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            }
            System.out.println("Rank is Excellence, Good, Fair or Poor.");
            System.out.print("Enter again: ");
        }
    }

    public static int checkExperience() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0 || result > 100) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter number from 0 to 100");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkYesNo() {
        while (true) {
            String result = sc.nextLine().trim();
            if (!result.isEmpty() || result.equalsIgnoreCase("Y")
                    || result.equalsIgnoreCase("N")) {
                return result;
            }
            System.out.println("Please enter Y or N.");
            System.out.print("Enter again: ");
        }
    }

    public static Date checkGraduationDate() {
        while (true) {
            String date = sc.nextLine().trim();
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
            Date date2 = null;
            try {
                date2 = dateformat.parse(date);
                return date2;
            } catch (Exception e) {
                System.out.println("Please enter follow fomat dd-MM-yyyy.");
                System.out.print("Enter again: ");
            }

        }
    }
}
