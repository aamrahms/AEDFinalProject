/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

import Business.Student.Student;
import java.util.Date;

/**
 *
 * @author aamrah
 */
public class Complaint {
    
    
    private String ComplaintID;
    private String status;
    private Student victimStudent;
    private String typeOfComplaint;
    private String dateOfIncident;
    
    //in case of Emergency complaint : location + date
    //add once location feature added
    //private String location;
    private static int count =0;
    //in case of normal complaint : accused student + date(manual)
    private Student accusedStudent;
   

    public Complaint(String typeOfComplaint, Student victimStudent, String dateOfIncident/*,String location*/) {
        this.ComplaintID = String.valueOf(count++);
        this.status = "New";
        this.victimStudent=victimStudent;
        this.typeOfComplaint=typeOfComplaint;
        //this.location = location;
        if(typeOfComplaint.equals("Emergency"))
        {
            this.dateOfIncident=String.valueOf(new Date());
        }
        else if (typeOfComplaint.equals("Normal"))
        {
            this.dateOfIncident=dateOfIncident;
        }
        
    }

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
    public String getDateOfIncident() {
        return dateOfIncident;
    }

    public void setDateOfIncident(String dateOfIncident) {
        this.dateOfIncident = dateOfIncident;
    }
    //add once location feature added
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

    public Student getVictimStudent() {
        return victimStudent;
    }

    public void setVictimStudent(Student victimStudent) {
        this.victimStudent = victimStudent;
    }

    public String getTypeOfComplaint() {
        return typeOfComplaint;
    }

    public void setTypeOfComplaint(String typeOfComplaint) {
        this.typeOfComplaint = typeOfComplaint;
    }

    public Student getAccusedStudent() {
        return accusedStudent;
    }

    public void setAccusedStudent(Student accusedStudent) {
        this.accusedStudent = accusedStudent;
    }
    
    
}  
