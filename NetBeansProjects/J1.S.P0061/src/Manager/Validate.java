/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Scanner;

/**
 *
 * @author thinh
 */
public class Validate {

    private static final Scanner sc = new Scanner(System.in);

    public static double checkDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < 0) throw new NumberFormatException();
                return result;
            }catch(NumberFormatException ex){
                System.out.println("Please enter double number: ");
                System.out.println("Enter again: ");
            }
        }
    }
}
