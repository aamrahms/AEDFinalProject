/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NUPD.PoliceInvestigatorJPanel;


/**
 *
 * @author aamrah
 */
public class PoliceInvestigatorRole extends Role {
    private RoleType roleType;
    public PoliceInvestigatorRole() {
        roleType=RoleType.PoliceInvestigator;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
         return new PoliceInvestigatorJPanel(userProcessContainer, account, system);
    }
}
