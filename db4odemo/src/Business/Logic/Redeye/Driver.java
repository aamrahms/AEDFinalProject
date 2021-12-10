/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic.Redeye;

import Business.Complaint.Complaint;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class Driver {
    ArrayList<Complaint> completedRidesList;
    Complaint complaint;
    

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
}
