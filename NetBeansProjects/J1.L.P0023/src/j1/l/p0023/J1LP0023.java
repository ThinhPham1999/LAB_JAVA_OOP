/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.l.p0023;

import Entity.*;
import Manager.*;
import java.util.ArrayList;

/**
 *
 * @author thinh
 */
public class J1LP0023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Fruit> listFruit = new ArrayList<>();
        ArrayList<Order> listOrder = new ArrayList<>();
        
        int choice;
        while(true){
            choice = Manager.menu();
            switch(choice){
                case 1:
                    Manager.createFruit(listFruit);
                    break;
                case 2:
                    Manager.viewOrder(listOrder);
                    break;
                case 3:
                    Manager.shopping(listOrder, listFruit);
                    break;
                case 4:
                    System.out.println("Exit.");
                    return;
                    
            }
        }
    }
    
}
