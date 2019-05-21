/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0053;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author thinh
 */
public class Manager {
    private static final Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.println("1. Input element.");
        System.out.println("2. Sort Ascending.");
        System.out.println("3. Sort Descreding.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputRange(1, 4);
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
    
    public static int checkInputInt(){
        while (true){
            try{
                int n = Integer.parseInt(sc.nextLine());
                return n;
            }catch(NumberFormatException e){
                System.out.println("Please enter integer number. ");
                System.out.print("Enter again: ");
            }
        }    
    }
    
    public int InputSizeArray(){
        System.out.println("Enter size of array: ");
        int length = checkInputInt();
        return length;
    }
    
    public int[] InputElements(int length){
        int arr[] = new int[length];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < length; i++){
            System.out.print("a["+i+"] = ");
            arr[i] = checkInputInt();
        }
        return arr;
    }
    
    public void ascending(int[] arr){
        Arrays.sort(arr);
    }
    
    public void decreding(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
       
    }
    
    public void print(int[] arr){
        System.err.println("Print array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
}
