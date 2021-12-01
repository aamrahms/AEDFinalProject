/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

import Business.Organisations.Student;
import java.util.Date;

/**
 *
 * @author aamrah
 */
public class EmergencyComplaint extends Complaint{
    private String dateOfIncident;
   

    public EmergencyComplaint(String typeOfComplaint, Student student) {
        super(typeOfComplaint,student);
        this.dateOfIncident=String.valueOf(new Date());
    }

    
    
    
    
}
