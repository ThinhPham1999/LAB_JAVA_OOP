
package studentlist;

import java.io.Serializable;


public class Student implements Serializable, Comparable<Student>{
    private String id;
    private String name;
    private int semester;
    private String coureName;

    public Student(String id, String name, int semester, String coureName) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.coureName = coureName;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String getCoureName() {
        return coureName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCoureName(String coureName) {
        this.coureName = coureName;
    }

    @Override
    public String toString() {
        System.out.printf("%-20s%-20s%-10d%-20s\n", id, name, semester, coureName);
        return "";
        //return "Student{" + "id=" + id + ", name=" + name + ", semester=" + semester + ", coureName=" + coureName + '}';
    } 

    @Override
    public int compareTo(Student t) {
        return this.name.compareTo(t.getName());
    }
}
