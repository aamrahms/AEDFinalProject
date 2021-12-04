/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.UHCS.DoctorJPanel;

/**
 *
 * @author aamrah
 */
public class DoctorRole extends Role{
    private Role.RoleType roleType;
    public DoctorRole() {
        roleType=Role.RoleType.Doctor;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
         return new DoctorJPanel(userProcessContainer, account, system);
    }
}