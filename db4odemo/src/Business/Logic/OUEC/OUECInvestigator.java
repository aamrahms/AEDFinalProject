/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic.OUEC;

import Business.Complaint.Complaint;
import Business.Employee.Employee;
import java.util.ArrayList;
/**
 *
 * @author aamrah
 */
public class OUECInvestigator {
    Employee employee;
    Complaint complaint;
//    ArrayList<Complaint> completedComplaintsList;

    public OUECInvestigator(Employee e) {
       this.employee=e;
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


}
