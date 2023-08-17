/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import javax.swing.JPanel;
import BusinessModel.EcoSystem;
import BusinessModel.Organization.DonorOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.DonorOrganisationAdmin.DonorOrganisationAdminWorkArea;
import UserInterface.Volunteer.VolunteerAdminWorkArea;
/**
 *
 * @author AkshitSaxena
 */
public class DonorOrganisationAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DonorOrganisationAdminWorkArea(downJPanel,UserAccount,(DonorOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.DonorOrganisationAdminRole.getValue();
}
    
}




