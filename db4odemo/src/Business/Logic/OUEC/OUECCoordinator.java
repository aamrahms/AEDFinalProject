/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Logic.OUEC;

import Business.Complaint.Complaint;
import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class OUECCoordinator {
    Employee employee;
    Complaint complaint;
    String designation;
//    ArrayList<Complaint> completedComplaintsList;

    public OUECCoordinator(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

//    public ArrayList<Complaint> getCompletedComplaintsList() {
//        return completedComplaintsList;
//    }
//
//    public void setCompletedComplaintsList(ArrayList<Complaint> completedComplaintsList) {
//        this.completedComplaintsList = completedComplaintsList;
//    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
