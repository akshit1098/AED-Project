/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;


import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.Organization.VolunteerOrganization;
import BusinessModel.Role.Role.RoleType;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.Volunteer.VolunteerDashboard;
import javax.swing.JPanel;

/**
 *
 * @author pulkitprakash
 */
public class VolunteerRole extends Role {
   
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new VolunteerDashboard(userProcessContainer,account,(VolunteerOrganization)organization,enterprise,system);
    }   
        @Override
        public String toString()
{
   return RoleType.VolunteerRole.getValue();
}
    
}
