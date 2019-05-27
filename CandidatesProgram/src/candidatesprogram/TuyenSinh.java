
package candidatesprogram;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TuyenSinh {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.println("1: Enter information about the contestants.");
        System.out.println("2: Display information about all contestant.");
        System.out.println("3: Search by idNames.");
        System.out.println("4: List information about the contestants for Area 1 or Area 2 or None");
        System.out.println("5: End program.");
        System.out.print("Enter your choice: ");
        int choice = checkInputRange(1, 5);
        return choice;
    }
    
    public void EnterInformation(ArrayList<Candidate> l){
        System.out.print("Enter id:");
        String id = checkInputString();
        System.out.print("Enter name:");
        String name = checkInputString();
        System.out.print("Enter address: ");
        String address = checkInputString();
        System.out.print("Enter priorities: (0. None, 1. Area 1, 2. Area 2) : ");
        int prioritie = checkInputRange(0, 3);
        
        Candidate newCandidate = new Candidate(id, name, address, Area.getAreaByCode(prioritie));
        l.add(newCandidate);
    }
    
    public void display(ArrayList<Candidate> l){
        System.out.println("Display all contestants");
        l.forEach((can) -> {
            System.out.println(can);
        });
    }
    
    public Candidate search(ArrayList<Candidate> l){
        System.out.print("Enter id want to search: ");
        String idName = checkInputString();
        for (Candidate can : l) {
            if (can.getIdName().equalsIgnoreCase(idName)){
                return can;
            }
        }
        return null;
    }
    
    public static void displayArea(ArrayList<Candidate> l, String area){
        System.out.println(area + ": ");
        l.stream().filter((can) -> (can.getPriorities().getText().equalsIgnoreCase(area))).forEachOrdered((can) -> {
            System.out.println(can);
        });
    }
    
    public void listForArea(ArrayList<Candidate> l){
        for (Area area: Area.values()){            
            System.out.println(area.getText());
            displayArea(l, area.getText());
                
        }
    }
    
    private static int checkInputRange(int min, int max){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n > max || n < min){
                    throw new NumberFormatException();
                }
                return n;
            }catch(NumberFormatException e){
                System.out.println("Please enter number in range.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    private static String checkInputString(){
        while(true){
            String st = sc.nextLine().trim();
            if(st.isEmpty()){
                System.out.println("String must not empty.");
                System.out.print("Enter again: ");
                continue;
            }
            return st;
        }
    }
}
