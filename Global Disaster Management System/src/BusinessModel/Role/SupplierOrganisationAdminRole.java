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
import BusinessModel.Organization.SupplierOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.SupplierOrganisationAdmin.SupplierOrganisationAdminWorkArea;
import UserInterface.Volunteer.VolunteerAdminWorkArea;
import javax.swing.JPanel;


import BusinessModel.EcoSystem;

import BusinessModel.Role.Role.RoleType;




/**
 *
 * @author AkshitSaxena
 */

public class SupplierOrganisationAdminRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierOrganisationAdminWorkArea(downJPanel,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.SupplierOrganisationAdminRole.getValue();
}
}



