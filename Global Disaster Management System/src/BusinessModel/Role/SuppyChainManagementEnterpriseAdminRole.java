/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Role;

import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.SupplyChainManagementEnterpriseAdmin.SupplyChainManagementEnterpriseAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author AkshitSaxena
 */
public class SuppyChainManagementEnterpriseAdminRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplyChainManagementEnterpriseAdminWorkArea(downJPanel,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return RoleType.SupplyChainManagementEnterpriseAdminRole.getValue();
}
}



    
    
  
    
   
