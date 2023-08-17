/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.SupplierOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.Organization.DonorOrganization;
import BusinessModel.Role.Role.RoleType;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.DonorOrganisationAdmin.DonorOrganisationAdminWorkArea;
import UserInterface.Doctor.DoctorUser.DoctorUserWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author AkshitSaxena
 */
public class DoctorUserRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DoctorUserWorkArea(downJPanel,UserAccount, org,enterprise,ESystem);
    }
        @Override
        public String toString()
{
   return RoleType.DoctorUserRole.getValue();
} 
}


