/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.Role.Role;
import BusinessModel.Role.VolunteerRole;
import BusinessModel.Volunteer.VolunteerDirectory;
import java.util.HashSet;

/**
 *
 * @author pulkitprakash
 */

public class VolunteerOrganization extends Organization {
    VolunteerDirectory volunteerList;

    public VolunteerOrganization(String name) {
        super(Organization.Type.Volunteer.getValue());
        volunteerList= new VolunteerDirectory();
    }

    public VolunteerDirectory getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(VolunteerDirectory volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VolunteerRole());
       return role;
    }
    
}





