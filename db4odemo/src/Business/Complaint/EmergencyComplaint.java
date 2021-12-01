/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

/**
 *
 * @author aamrah
 * @author fianrodrigues
 */
public class EmergencyComplaint 
{
    String dateOfIncident;
    String timeOfIncident;
    //String location;

    public String getDateOfIncident() 
    {
        return dateOfIncident;
    }

    public void setDateOfIncident(String dateOfIncident) 
    {
        this.dateOfIncident = dateOfIncident;
    }

    public String getTimeOfIncident()
    {
        return timeOfIncident;
    }

    public void setTimeOfIncident(String timeOfIncident) 
    {
        this.timeOfIncident = timeOfIncident;
    }
    
    
}
