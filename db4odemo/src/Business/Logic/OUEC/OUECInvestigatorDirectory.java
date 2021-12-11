/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic.OUEC;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class OUECInvestigatorDirectory {
    
    ArrayList<OUECInvestigator> ouecInvestigatorList;
    
    public void createOUECInvestigator(Employee e) {
        OUECInvestigator ouecInvestigator = new OUECInvestigator(e);
        ouecInvestigatorList.add(ouecInvestigator);
    }
    
    //first update in Employee Directory it returns Employee object and call below one
    public void updateOUECInvestigator(OUECInvestigator ouecInvestigator, Employee e){
        for (OUECInvestigator ouec : ouecInvestigatorList) {
            if (ouec.getEmployee().getUsername().equals(e.getUsername())) {
                ouec.getEmployee().setName(e.getName());
                ouec.getEmployee().setPassword(e.getPassword());
                ouec.getEmployee().setAddress(e.getAddress());
                ouec.getEmployee().setEmail(e.getEmail());
                ouec.getEmployee().setNeuid(e.getNeuid());
                ouec.getEmployee().setPhone(e.getPhone());
            }
        }
    }
    
    public void deleteOUECInvestigator(OUECInvestigator ouecInvestigator, Employee e) {
        for (OUECInvestigator ouec : ouecInvestigatorList) {
            if (ouec.getEmployee().getUsername().equals(e.getName())) {
                ouecInvestigatorList.remove(ouec);
                return;
            }
        }        
    }

    public ArrayList<OUECInvestigator> getOuecInvestigatorList() {
        return ouecInvestigatorList;
    }

    public void setOuecInvestigatorList(ArrayList<OUECInvestigator> ouecInvestigatorList) {
        this.ouecInvestigatorList = ouecInvestigatorList;
    }
    
    
}
