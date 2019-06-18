/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


/**
 *
 * @author thinh
 */
public class Intern extends Candidate{
    private String Majors;
    private int semester;
    private String Universityname;

    public Intern() {
    }

    public Intern(String Majors, int semester, String Universityname, String CandidateId, String FirstName, String LastName, int BirthDate, String Address, String Phone, String Email, int CandidateType) {
        super(CandidateId, FirstName, LastName, BirthDate, Address, Phone, Email, CandidateType);
        this.Majors = Majors;
        this.semester = semester;
        this.Universityname = Universityname;
    }

    public String getMajors() {
        return Majors;
    }

    public int getSemester() {
        return semester;
    }

    public String getUniversityname() {
        return Universityname;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniversityname(String Universityname) {
        this.Universityname = Universityname;
    }
    
    @Override
    public String toString() {
        return super.FirstName + " | " + super.LastName + " | " + super.Address 
                + super.Phone + " | " + super.Email + " | " + super.CandidateType;
    }
}
