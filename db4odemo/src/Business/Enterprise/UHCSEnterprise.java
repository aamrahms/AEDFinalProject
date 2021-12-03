/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdvisorRole;
import Business.Role.DoctorRole;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class UHCSEnterprise extends Enterprise{
     public UHCSEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.UHCSEnterprise);
    }
    //aRRAYLIST OF Organisations 

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles=new ArrayList<Role>();
        roles.add(new ReceptionistRole());
        roles.add(new DoctorRole());
        roles.add(new AdvisorRole());
        return roles;
    }
}
