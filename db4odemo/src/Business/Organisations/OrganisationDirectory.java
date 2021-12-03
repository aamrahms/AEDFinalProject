/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisations;

import Business.Organisations.Organisation.Type;
import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class OrganisationDirectory {
    private ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        this.organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }

    public void createOrganisation(Type type, String name) {
        this.organisationList = organisationList;
    }
    
    
    
}
