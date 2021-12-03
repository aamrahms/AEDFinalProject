/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdvisorRole;
import Business.Role.DoctorRole;
import Business.Role.OUECCoordinatorRole;
import Business.Role.OUECInvestigatorRole;
import Business.Role.PresidentRole;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class OUECEnterprise extends Enterprise{
    public OUECEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.OUECEnterprise);
    }
    //aRRAYLIST OF Organisations 

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles=new ArrayList<Role>();
        roles.add(new OUECCoordinatorRole());
        roles.add(new OUECInvestigatorRole());
        roles.add(new PresidentRole());
        return roles;
    }
}
