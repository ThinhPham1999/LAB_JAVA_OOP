/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0053;

import java.util.Arrays;

/**
 *
 * @author thinh
 */
public class J1SP0053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager ma = new Manager();
        int[] arr = new int[10];
        while (true){
            int choice = ma.menu();
            switch(choice){
                case 1:
                    int length = ma.InputSizeArray();
                    arr = Arrays.copyOf(ma.InputElements(length), length);
                    ma.print(arr);
                    break;
                case 2:
                    ma.ascending(arr);
                    ma.print(arr);
                    break;
                case 3:
                    ma.decreding(arr);
                    ma.print(arr);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
            }
        }
    }
    
}
