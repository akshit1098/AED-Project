/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;


import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.EmergencyAssistanceEnterpriseAdmin.EmergencyAssistanceEnterpriseAdminWorkArea;
import javax.swing.JPanel;


/**
 *
 * @author HM
 */
public class EmergencyAssistanceEnterpriseAdminRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new EmergencyAssistanceEnterpriseAdminWorkArea(downJPanel,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return RoleType.EmergencyAssistanceEnterpriseAdminRole.getValue();
}
    
   
}
