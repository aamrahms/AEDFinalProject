/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic.Redeye;

import Business.Complaint.Complaint;
import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class Driver {
    Employee employee;
    ArrayList<Complaint> completedRidesList;
    Complaint complaint;

    public Driver(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Complaint> getCompletedRidesList() {
        return completedRidesList;
    }

    public void setCompletedRidesList(ArrayList<Complaint> completedRidesList) {
        this.completedRidesList = completedRidesList;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
