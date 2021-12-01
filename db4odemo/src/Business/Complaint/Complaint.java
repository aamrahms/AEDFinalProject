/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

import Business.Organisations.Student;

/**
 *
 * @author aamrah
 */
public class Complaint {
    
    
    private String ComplaintID;
    private String status;
    private Student victimStudent;
    private String typeOfComplaint;
    private static int count =0;

    public Complaint(String typeOfComplaint, Student student) {
        this.ComplaintID = String.valueOf(count++);
        this.status = "New";
        this.victimStudent=student;
        this.typeOfComplaint=typeOfComplaint;
    }

//Emergency and Normal
    
    //if(Emergency) ==>goto emergency Panel 
    //else if (Normal) ==>Normal Complaint
    
    //discrimination , assault, allegedAccusation, firing , Plagarism

    public String getComplaintID() {
        return ComplaintID;
    }

    public void setComplaintID(String ComplaintID) {
        this.ComplaintID = ComplaintID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
