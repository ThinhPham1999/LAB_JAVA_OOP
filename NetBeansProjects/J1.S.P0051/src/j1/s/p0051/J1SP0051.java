/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

/**
 *
 * @author thinh
 */
public class J1SP0051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manager ma = new Manager();
        while (true){
            int choice = ma.menu();
            switch(choice){
                case 1:
                    ma.normalCalculator();
                    break;
                case 2:
                    ma.BMICalculator();
                    break;
                case 3:
                    System.out.println("Exit");
                    return;
            }
        }
    }
    
}
