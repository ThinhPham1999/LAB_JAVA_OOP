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
public class Experience extends Candidate{
    private int ExpInYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience(int ExpInYear, String ProSkill, String CandidateId, String FirstName, String LastName, int BirthDate, String Address, String Phone, String Email, int CandidateType) {
        super(CandidateId, FirstName, LastName, BirthDate, Address, Phone, Email, CandidateType);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    @Override
    public String toString() {
        return super.FirstName + " | " + super.LastName + " | " + super.Address 
                + super.Phone + " | " + super.Email + " | " + super.CandidateType;
    }
    
    
}
