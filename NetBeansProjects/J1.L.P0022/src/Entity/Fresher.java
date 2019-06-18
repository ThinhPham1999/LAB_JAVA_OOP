/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;



/**
 *
 * @author thinh
 */
public class Fresher extends Candidate{
    private Date Graduation_date;
    private String Graduation_rank;
    private String University;

    public Fresher() {
    }

    public Fresher(Date Graduation_date, String Graduation_rank, String University, String CandidateId, String FirstName, String LastName, int BirthDate, String Address, String Phone, String Email, int CandidateType) {
        super(CandidateId, FirstName, LastName, BirthDate, Address, Phone, Email, CandidateType);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.University = University;
    }

    public Date getGraduation_date() {
        return Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public String getUniversity() {
        return University;
    }

    public void setGraduation_date(Date Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public void setUniversity(String University) {
        this.University = University;
    }
    
    @Override
    public String toString() {
        return super.FirstName + " | " + super.LastName + " | " + super.Address 
                + super.Phone + " | " + super.Email + " | " + super.CandidateType;
    }
}
