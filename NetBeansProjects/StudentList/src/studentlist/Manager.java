package studentlist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.Collections;

public class Manager {
    
    public static int menu(){
        System.out.println("1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete. ");
        System.out.println("4. Report.");
        System.out.println("5. Exit.");
        System.out.print("Enter your choice: ");
        int choice  = Validate.checkInputLimit(1, 5);
        return choice;
    }
    
    public static String updateDelete(){
        System.out.println("Enter D for delete, U for update.");
        System.out.print("Enter your choice: ");
        String choice = Validate.checkUpdateDelete();
        return choice;
    }

    public static void WriteObjectToFile(Object data, String file) {
        Validate.checkFileExist(file);
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(data);
            //objectOut.writeObject(new Student("03","Thanh", 3, "Java"));
            System.out.println("The Object  was succesfully written to a file");
            objectOut.close();
            fileOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // read file object
    public static Object ReadObjectFromFile(String file) {
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object input = objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return input;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void create(ArrayList<Student> listStudent){
        String studentID = "";
        System.out.print("Enter student ID: ");
        while(true){
            studentID = Validate.checkInputString();
            if (!Validate.checkExits(studentID, listStudent)){
                break;
            }
            System.out.print("Id is Exsit. Enter again: ");
        }
        System.out.print("Enter student name: ");
        String studentName = Validate.checkInputString();
        System.out.print("Enter student semester: ");
        int studentSemeter = Validate.checkInputInteger();
        System.out.print("Enter student course (Java, .Net, C/C++): ");
        String studentCourse  = Validate.checkInputCourse();
        
        Student newStudent = new Student(studentID, studentName, studentSemeter, studentCourse);
        listStudent.add(newStudent);
        System.out.println("Create successful.");
    }
    
    private static Student findByName(ArrayList<Student> listStudent, String name){
        for (Student student: listStudent){
            if (name.equalsIgnoreCase(student.getName())){
                return student;
            }
        }
        return null;
    }
    
    private static Student findById(ArrayList<Student> listStudent, String id){
        for (Student student : listStudent){
            if (student.getId().equalsIgnoreCase(id)){
                return student;
            }
        }
        return null;
    }
    
    public static void find(ArrayList<Student> listStudent){
        Collections.sort(listStudent);
        System.out.print("Enter student name: ");
        String name = Validate.checkInputString();
        Student findStudent = findByName(listStudent, name);
        if (findStudent == null){
            System.out.println("Student not found.");
            return;
        }
        System.out.print(findStudent);
    }
    
    public static void update(ArrayList<Student> listStudent){
        System.out.print("Enter name: ");
        String id = Validate.checkInputString();
        Student updated = findById(listStudent, id);
        if (updated == null){
            System.out.println("Student not found.");
            return;
        }
        System.out.print("Enter new name: ");
        String newName = Validate.checkInputString();
        System.out.print("Enter new Semester: ");
        int newSemeter = Validate.checkInputInteger();
        System.out.print("Enter new Course: ");
        String newCourse = Validate.checkInputCourse();
        
        updated.setSemester(newSemeter);
        updated.setName(newName);
        updated.setCoureName(newCourse);   
        System.out.println("Update successful.");
    }
    
    public static void delete(ArrayList<Student> listStudent){
        System.out.print("Enter name: ");
        String id = Validate.checkInputString();
        Student deleted = findById(listStudent, id);
        if (deleted == null){
            System.out.println("Student not found.");
            return;
        }
        listStudent.remove(deleted);
        System.out.println("Delete sucessful.");
    }
    
    public static void report(ArrayList<Student> listStudent){
        System.out.printf("%-20s%-20s%-10s%-20s\n", "ID", "Name", "Semeter", "Course");
        for (Student student : listStudent){
            System.out.print(student);
        }
    }
}
