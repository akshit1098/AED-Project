/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;

import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;


import BusinessModel.EcoSystem;


import BusinessModel.Organization.SupplierOrganization;

import UserInterface.Supplier.SupplierUser.SupplierUserWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author AkshitSaxena
 */

public class SupplierRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierUserWorkArea(downJPanel,UserAccount,(SupplierOrganization)org,enterprise, ESystem);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SupplierRole.getValue();
}    
}






