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
import UserInterface.FundRaiser.FundRaiserUser.FundRaisingUserWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author pulkitprakash
 */
public class FundRaiserRole extends Role {
    
      @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new FundRaisingUserWorkArea(downJPanel,account,(FundRaisingOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.FundRaiserRole.getValue();
}
    
}
