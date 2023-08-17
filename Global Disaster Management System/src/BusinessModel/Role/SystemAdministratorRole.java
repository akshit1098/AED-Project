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
import BusinessModel.UserAccount.UserAccount;
import UserInterface.SystemAdministrator.SystemAdministratorWorkArea;


/**
 *
 * @author HM
 */


public class SystemAdministratorRole extends Role 
{
 
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system)
    {
        return new SystemAdministratorWorkArea  (downJPanel , system);
    }
        @Override
        public String toString()
{
   return RoleType.SystemAdministratorRole.getValue();
}
}





