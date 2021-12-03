/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.OUEC.OUECInvestigatorJPanel;


/**
 *
 * @author aamrah
 */
public class OUECInvestigatorRole extends Role {
    private RoleType roleType;
    public OUECInvestigatorRole() {
        roleType=RoleType.OUECInvestigator;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
         return new OUECInvestigatorJPanel(userProcessContainer, account, system);
    }
}
