
package studentdirectory;

import java.util.Scanner;

public class StudentDirectory {
    
    Scanner sc = new Scanner(System.in);
    
    public String checkInputString(){
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
    
    public double checkInputDouble(){
        while(true){
            try{
                double db = Double.parseDouble(sc.nextLine().trim());
                if (db <= 0){
                    throw new NumberFormatException();
                }
                return db;
            }catch(NumberFormatException e){
                System.out.println("Please enter positive real number.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public int checkInputInteger(){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n <= 0){
                    throw new NumberFormatException();
                }
                return n;
            }catch(NumberFormatException e){
                System.out.println("Please enter positive integer number.");
                System.out.print("Enter again: ");
            }
        }
    }
    public static void main(String[] args) {
        Student st1  = new Student(1, "Pham Van Phu Thinh", 6.0,8.0);
        Student st2 = new Student(2, "Tran Cong Van" , 6.5, 5.0);
        Student st3 = new Student();
        
        System.out.print("Enter Id: ");
        st3.setIdStudent(new StudentDirectory().checkInputInteger());
        System.out.print("Enter name: ");
        st3.setFullName(new StudentDirectory().checkInputString());
        System.out.println("Enter theory mark: ");
        st3.setTheoryMark(new StudentDirectory().checkInputDouble());
        System.out.print("Enter assignment mark: ");
        st3.setAssignmentMark(new StudentDirectory().checkInputDouble());
        
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "FullName", "Theory Mark",
            "Assignment Mark");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
    
}
