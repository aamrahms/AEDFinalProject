/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

import Business.Logic.NUPD.PoliceOfficer;
import Business.Logic.OUEC.OUECCoordinator;
import Business.Logic.OUEC.OUECInvestigator;
import Business.Logic.Redeye.Driver;
import Business.Logic.UHCS.Advisor;
import Business.Logic.UHCS.Doctor;
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
    private String sender;
    private String receiver;
    private String location;
    private String typeOfIncident;
    //usernames :
    //firearm, threats/stalking, plagarism
    private PoliceOfficer policeOfficer;
    private String policeOfficerFeedback;
    //firearm, threats/stalking, plagarism
    private OUECCoordinator OUECCoordinator;
    private String OUECCoordinatorFeedback;
    //firearm , threats/stalking , plagarism
    private OUECInvestigator OUECInvestigator;
    private String OUECInvestigatorFeedback;
    //assault , injury
    private Doctor doctor;
    private String DoctorFeedback;
    //assault , injury
    private Advisor advisor;
    private String AdvisorFeedback;
//    threats/stalking
    private Driver driver;
    private String DriverFeedback;
    
    
    //private 
   
    
    //in case of Emergency complaint : location + date
    //add once location feature added
    
    private static int count =0;
    //in case of normal complaint : accused student + date(manual)
    private Student accusedStudent;
    private String natureOfIncident;
    private String description;
   

    public Complaint(String typeOfComplaint, Student student, String dateOfIncident,String location, String typeOfIncident) {
        this.ComplaintID = String.valueOf(count++);
        this.status = "FreshCase";
        this.victimStudent=student;
        this.typeOfComplaint=typeOfComplaint;
        this.sender="";
        this.receiver="ChiefOfficer";
        this.typeOfIncident = typeOfIncident;
        
        this.location = location;
        if(typeOfComplaint.equals("Emergency"))
        {
            this.dateOfIncident=String.valueOf(new Date());
//            this.receiver="ChiefOfficer";
            this.accusedStudent=null;
            this.natureOfIncident=" ";
            this.description=" ";
            
        }
        else if (typeOfComplaint.equals("Normal"))
        {
            this.dateOfIncident=dateOfIncident;
//            this.receiver="OUEC";
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
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeOfIncident() {
        return typeOfIncident;
    }

    public void setTypeOfIncident(String typeOfIncident) {
        this.typeOfIncident = typeOfIncident;
    }

    public String getNatureOfIncident() {
        return natureOfIncident;
    }

    public void setNatureOfIncident(String natureOfIncident) {
        this.natureOfIncident = natureOfIncident;
    }

    public PoliceOfficer getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }
    
    @Override
    public String toString(){
        return this.ComplaintID;
    }
}  
