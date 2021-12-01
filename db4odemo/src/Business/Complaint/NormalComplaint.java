/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Complaint;

import Business.Student.Student;

/**
 *
 * @author aamrah
 * @author fianrodrigues
 */
public class NormalComplaint 
{
    String dateOfIncident;
    String timeOfIncident;
    Student accusedStudent;
    Student victimStudent;
    
    String describeIncident;
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

    public Student getAccusedStudent() 
    {
        return accusedStudent;
    }

    public void setAccusedStudent(Student accusedStudent)
    {
        this.accusedStudent = accusedStudent;
    }

    public Student getVictimStudent()
    {
        return victimStudent;
    }

    public void setVictimStudent(Student victimStudent) 
    {
        this.victimStudent = victimStudent;
    }

    public String getDescribeIncident()
    {
        return describeIncident;
    }

    public void setDescribeIncident(String describeIncident)
    {
        this.describeIncident = describeIncident;
    }
    
}
