/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic.NUPD;
import Business.Complaint.Complaint;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class PoliceOfficer {
    ArrayList<Complaint> solvedComplaintList;
    

    public ArrayList<Complaint> getComplaintList() {
        return solvedComplaintList;
    }

    public void setComplaintList(ArrayList<Complaint> solvedComplaintList) {
        this.solvedComplaintList = solvedComplaintList;
    }
    
    
}
