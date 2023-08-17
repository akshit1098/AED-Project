/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;

import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import javax.swing.JPanel;
import BusinessModel.EcoSystem;



import UserInterface.DisasterManagementEnterpriseAdmin.DisasterManagementEnterpriseAdminWorkArea;
import UserInterface.SystemAdministrator.ManageEnterprise;


/**
 *
 * @author pulkitprakash
 */

public class DisasterManagementEnterpriseAdminRole extends Role
{
   @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new DisasterManagementEnterpriseAdminWorkArea(downJPanel,system, enterprise);
    } 
        @Override
        public String toString()
{
   return Role.RoleType.DisasterManagementEnterpriseAdminRole.getValue();
}
}






