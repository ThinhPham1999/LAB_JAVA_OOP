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
public class Candidate {
    protected String CandidateId;
    protected String FirstName;
    protected String LastName;
    protected int BirthDate;
    protected String Address;
    protected String Phone;
    protected String Email;
    protected int CandidateType;

    protected Candidate() {
    }

    protected Candidate(String CandidateId, String FirstName, String LastName, int BirthDate, String Address, String Phone, String Email, int CandidateType) {
        this.CandidateId = CandidateId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.CandidateType = CandidateType;
    }

    public String getCandidateId() {
        return CandidateId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getBirthDate() {
        return BirthDate;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public int getCandidateType() {
        return CandidateType;
    }

    public void setCandidateId(String CandidateId) {
        this.CandidateId = CandidateId;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setBirthDate(int BirthDate) {
        this.BirthDate = BirthDate;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCandidateType(int CandidateType) {
        this.CandidateType = CandidateType;
    }
    
    
}
