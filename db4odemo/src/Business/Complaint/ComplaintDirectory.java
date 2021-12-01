/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;
import Business.Organisations.Student;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class ComplaintDirectory {
    ArrayList <Complaint> complaintList;
    Complaint complaint ;
    //Normal 
    //String dateOfIncident; String timeOfIncident; Student accusedStudent; Student victimStudent;
    //Emergency 
    //String dateOfIncident;
    //String timeOfIncident;
    //String location;
    //String describeIncident;
     public Complaint createComplaint(String typeOfComplaint, Student student)
    {
                    
        if(typeOfComplaint.equals("Emergency"))
        {
            complaint = new EmergencyComplaint(typeOfComplaint, student);
        } 
        else if(typeOfComplaint.equals("Normal"))
        {
            complaint = new NormalComplaint(typeOfComplaint, student);
        }
        else{
            return null;
        }
        complaintList.add(complaint);
        return complaint;
    }
    public ArrayList<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(ArrayList<Complaint> complaintList) {
        this.complaintList = complaintList;
    }
    
    
}
