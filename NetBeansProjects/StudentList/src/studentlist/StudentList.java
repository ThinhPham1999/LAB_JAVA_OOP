
package studentlist;

import java.util.ArrayList;
import java.util.Arrays;


public class StudentList {

    
    public static void main(String[] args) {
        //demo();
        Object data = Manager.ReadObjectFromFile("student.txt");
        ArrayList<Student> listStudent = (ArrayList<Student>)data;
        int key;
        while (true){
            key = Manager.menu();
            switch(key){
                case 1:
                    Manager.create(listStudent);
                    break;
                case 2:
                    Manager.find(listStudent);
                    break;
                case 3:
                    String ud = Manager.updateDelete();
                    if (ud.equalsIgnoreCase("U")){
                        Manager.update(listStudent);
                    }else{
                        Manager.delete(listStudent);
                    }
                    break;
                case 4:
                    Manager.report(listStudent);
                    break;
                case 5:
                    Manager.WriteObjectToFile(listStudent, "student.txt");
                    System.out.println("Exit.");
                    return;
            }
        }
        
    }
    
    public static void demo(){
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("001", "Nam", 2, "Java"));
        listStudent.add(new Student("002", "Van", 1, "C#"));
        Manager.WriteObjectToFile(listStudent, "student.txt");
        Object data = Manager.ReadObjectFromFile("student.txt");
//        System.out.println(data);
        ArrayList<Student> listStudent1 = (ArrayList<Student>)data;
        for (Student student: listStudent1){
            System.out.print(student);
        }
        
    }
    
}
