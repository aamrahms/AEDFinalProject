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
    ArrayList <Complaint> complaintList;
    //STUDENTDIRECTORY
    Complaint complaint ;
    //Normal 
    //String dateOfIncident; String timeOfIncident; Student accusedStudent; Student victimStudent;
    //Emergency 
    //String dateOfIncident;
    //String timeOfIncident;
    //String location;
    //String describeIncident;
     public Complaint createComplaint(String typeOfComplaint, Student student, String dateOfIncident)
    {
                    
        if(typeOfComplaint.equals("Emergency"))
        {
            //complaint = new EmergencyComplaint(typeOfComplaint, student);
            complaint= new Complaint(typeOfComplaint, student,null);
        } 
        else if(typeOfComplaint.equals("Normal"))
        {
            //complaint = new NormalComplaint(typeOfComplaint, student);
            complaint = new Complaint(typeOfComplaint, student, dateOfIncident);
        }
        else{
            return null;
        }
        complaintList.add(complaint);
        return complaint;
    }
//     public void appendEmergencyComplaint(EmergencyComplaint complaint/*,String location*/)
//     {
//         //complaint.setLocation(location);
//     }
//     public void appendNormalComplaint(Complaint complaint /*,String location*/ ,String dateOfIncident, Student accusedStudent,Student victimStudent){
//         //complaint.setLocation(location);
//        
//        complaint.setDateOfIncident(dateOfIncident);
//        complaint.setAccusedStudent(accusedStudent);
//        complaint.setVictimStudent(victimStudent);
//        
//     }
    public ArrayList<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(ArrayList<Complaint> complaintList) {
        this.complaintList = complaintList;
    }
    
    
}
