
package studentdirectory;


public class Student {
    private int idStudent;
    private String fullName;
    private double theoryMark;
    private double assignmentMark;

    public Student() {
    }

    public Student(int idStudent, String fullName, double theoryMark, double assignmentMark) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.assignmentMark = assignmentMark;
    }

    public Student(int idStudent, String fullName) {
        this.idStudent = idStudent;
        this.fullName = fullName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public double getTheoryMark() {
        return theoryMark;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    @Override
    public String toString() {
        System.out.printf("%-10s%-25s%-20s%-25s", this.idStudent, this.fullName,
                this.theoryMark, this.assignmentMark);
        return "";
    }
    
    
}
