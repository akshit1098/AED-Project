/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;


import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.FundRaisingOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.FundRaisingOrganisationAdmin.FundRaisingOrganisationAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author pulkitprakash
 */
public class FundRaisingOrganisationAdminRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new FundRaisingOrganisationAdminWorkArea(downJPanel,enterprise);
    }
        @Override
        public String toString()
{
   return Role.RoleType.FundRaisingOrganisationAdminRole.getValue();
}
    
}
