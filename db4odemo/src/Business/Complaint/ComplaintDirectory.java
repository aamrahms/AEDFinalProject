/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;
import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class ComplaintDirectory {
    private ArrayList <Complaint> complaintList;
    //STUDENTDIRECTORY
    Complaint complaint ;
    //Normal 
    //String dateOfIncident; String timeOfIncident; Student accusedStudent; Student victimStudent;
    //Emergency 
    //String dateOfIncident;
    //String timeOfIncident;
    //String location;
    //String describeIncident;

    public ComplaintDirectory() {
        this.complaintList = new ArrayList<Complaint>();
    }
    
     public Complaint createComplaint(String typeOfComplaint, Student student, String dateOfIncident , String location, String typeOfIncident)
    {
                    
        if(typeOfComplaint.equals("Emergency"))
        {
            //complaint = new EmergencyComplaint(typeOfComplaint, student);
            complaint= new Complaint(typeOfComplaint, student,null, location, typeOfIncident);
            complaintList.add(complaint);
        } 
        else if(typeOfComplaint.equals("Normal"))
        {
            //complaint = new NormalComplaint(typeOfComplaint, student);
            complaint = new Complaint(typeOfComplaint, student, dateOfIncident, location, typeOfIncident);
            complaintList.add(complaint);
        }
        else{
            return null;
        }
        
        return complaint;
    }
//     public void appendEmergencyComplaint(EmergencyComplaint complaint/*,String location*/)
//     {
//         //complaint.setLocation(location);
//     }
     public void appendNormalComplaint(Complaint complaint ,String location ,String dateOfIncident, Student accusedStudent, String description,String natureOfIncident){
         //complaint.setLocation(location);
        
        complaint.setDateOfIncident(dateOfIncident);
        complaint.setAccusedStudent(accusedStudent);
        //complaint.setVictimStudent(victimStudent);
        complaint.setDescription(description); 
        complaint.setNatureOfIncident(natureOfIncident);
   
        
     }
    public ArrayList<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(ArrayList<Complaint> complaintList) {
        this.complaintList = complaintList;
    }
    
    
}
